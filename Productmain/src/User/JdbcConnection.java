package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/skincareproduct\r\n";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Sherzad@45";

    public static Connection getConnection() throws SQLException {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Connection closed!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
