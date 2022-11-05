package l11kursovaya.methods;
import java.sql.*;


public class Connection {
    private static java.sql.Connection conn;

    private static void registerDriver() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver not found");
        }
        System.out.println("Driver is registred");
            }

    private static java.sql.Connection create() {

        registerDriver();
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/JavaBase?user=postgres&password=123&ssl=false;");
            System.out.println("We are connected");
        } catch (SQLException e) {
            System.err.println("Connection is not established");
        }
        return conn;
    }

    public static java.sql.Connection getConnection() {
        if (conn == null) {
            return create();
        }
        return conn;
    }

    public static void close () {
        if (conn != null) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException e) {
                System.err.println ("Error while closing the connection");
            }
        }
    }
}
