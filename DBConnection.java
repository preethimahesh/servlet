import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.io.PrintWriter;
public class DBConnection {
     

    static Connection conn = null;

    private DBConnection() {
    }

    public static Connection getDBConnection() {

        try {
            if (conn == null) {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg2", "root", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}
