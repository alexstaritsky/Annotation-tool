package annotation.tool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

    public boolean addBestand(String bestandnaam, String type) {
        try {
            Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement("insert into bestand values (?, ?, ?)");
            statement.setInt(1, System.identityHashCode(bestandnaam));
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

    public List<Bestand> getBestanden() {
        List<Bestand> files = new ArrayList<>();
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            ResultSet raw = statement.executeQuery("select * from bestand");
            while (raw.next()) {
                files.add(new Bestand(raw.getInt(1), raw.getString(2), raw.getString(3)));
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return files;
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
