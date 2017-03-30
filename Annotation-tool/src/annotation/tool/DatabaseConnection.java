package annotation.tool;

import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alexander
 */
public class DatabaseConnection {

    private String host;
    private String username;
    private String password;
    private int port;

    public DatabaseConnection(String host, String username, String password, int port) {
        this.host = host;
        this.username = username;
        this.password = password;
        this.port = port;
    }

    public static boolean checkJDBCDriver() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            return false;
        }
        return true;
    }

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

    public boolean checkBestand(String bestandnaam) {
        try {
            Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement("select * from bestand where bestandnaam = ?");
            statement.setString(1, bestandnaam);
            ResultSet raw = statement.executeQuery();
            boolean isEmpty = raw.isBeforeFirst();
            connection.close();
            return isEmpty;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

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

    private Connection connect() throws SQLException {
        Connection connection = DriverManager.getConnection(String.format("jdbc:oracle:thin:@%s:%s:XE", host, Integer.toString(port)), username, password);
        if (connection == null) {
            throw new SQLException("Connection is null!");
        }
        connection.setAutoCommit(false);
        return connection;
    }

}
