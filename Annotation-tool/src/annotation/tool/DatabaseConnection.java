package annotation.tool;

import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * De functie van deze class is een connectie maken met een database en het
 * inlezen en invoeren van een bestand in deze database.
 *
 * @author Alexander
 */
public class DatabaseConnection {

    private String host;
    private String username;
    private String password;
    private int port;

    /**
     * Met deze functie worden er gegeven opgevraagd voor het maken van een
     * connectie gemaakt met een database, hierbij wordt er gevraagd naar de
     * host(url van de database), username, password en de port.
     *
     * @param host
     * @param username
     * @param password
     * @param port
     */
    public DatabaseConnection(String host, String username, String password, int port) {
        this.host = host;
        this.username = username;
        this.password = password;
        this.port = port;
    }

    /**
     * Deze functie checkt of er een juist JDBC driver aanwezig is Als dit er
     * niet is returnt hij false en als het wel aanwezig is, true.
     *
     * @return false/true
     */
    public static boolean checkJDBCDriver() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            return false;
        }
        return true;
    }

    /**
     * Deze functie test de connectie, wanneer er connectie gemaakt kan worden,
     * returnt hij true en anders false.
     *
     * @return false/true
     */
    public boolean testConnection() {
        try {
            Connection connection = connect();
            if (connection != null) {
                connection.close();
                return true;
            }
        } catch (SQLException e) {
            return false;
        }
        return false;
    }

    /**
     * Deze functie kijkt of het bestand dat geupload wordt al aanwezig is op de
     * database.
     *
     * @param bestandnaam
     * @return isEmpty
     * @throws SQLException
     */
    public boolean checkBestand(String bestandnaam) throws SQLException {
        Connection connection = connect();
        PreparedStatement statement = connection.prepareStatement("select * from bestand where bestandnaam = ?");
        statement.setString(1, bestandnaam);
        ResultSet raw = statement.executeQuery();
        boolean isEmpty = raw.isBeforeFirst();
        connection.close();
        return isEmpty;
    }

    /**
     * Deze functie voegt het bestand toe als deze nog niet aanwezig is op de
     * database.
     *
     * @param bestandID
     * @param bestandnaam
     * @param type
     * @return true/false
     */
    public boolean addBestand(int bestandID, String bestandnaam, String type) {
        try {
            Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement("insert into bestand values (?, ?, ?)");
            statement.setInt(1, bestandID);
            statement.setString(2, bestandnaam);
            statement.setString(3, type);
            statement.executeUpdate();
            connection.commit();
            connection.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    /**
     * Voegt een sequentie toe aan de database, bij elke sequentie wordt de
     * sequentieID, type, sequentie en bestandID meegegeven. Als dit is gelukt,
     * returnt de functie true, en anders false.
     *
     * @param sequentieID
     * @param type
     * @param sequentie
     * @param bestandID
     * @return true/false
     */
    public boolean addSequentie(int sequentieID, String type, String sequentie, int bestandID) {
        try {
            Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement("insert into sequentie values (?, ?, ?, ?)");
            Blob blob = connection.createBlob();
            blob.setBytes(1, sequentie.toUpperCase().getBytes(StandardCharsets.UTF_8));
            statement.setInt(1, sequentieID);
            statement.setString(2, type);
            statement.setBlob(3, blob);
            statement.setInt(4, bestandID);
            statement.executeUpdate();
            connection.commit();
            connection.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    /**
     * Voegt een ORF toe aan de database, bij elke ORF wordt de startpositie,
     * eindpositie en bestandID meegegeven. Als dit is gelukt, returnt de
     * functie true, en anders false.
     *
     * @param startpositie
     * @param eindpositie
     * @param bestandID
     * @return true/falsa
     */
    public boolean addORF(int startpositie, int eindpositie, int bestandID) {
        try {
            Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement("insert into orf values (?, ?, ?)");
            statement.setInt(1, startpositie);
            statement.setInt(2, eindpositie);
            statement.setInt(3, bestandID);
            statement.executeUpdate();
            connection.commit();
            connection.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    /**
     * Met deze functie wordt er een connectie gemaakt met een database op basis
     * van de gevraagde gegevens uit getConnection.
     *
     * @return connection
     * @throws SQLException
     */
    private Connection connect() throws SQLException {
        Connection connection = DriverManager.getConnection(String.format("jdbc:oracle:thin:@%s:%s:XE", host, Integer.toString(port)), username, password);
        if (connection == null) {
            throw new SQLException("Connection is null!");
        }
        connection.setAutoCommit(false);
        return connection;
    }

}
