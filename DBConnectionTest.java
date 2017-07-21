import java.sql.*;

//import utility.DBConnection;

public class DBConnectionTest {

    public static void main(String[] args) {
        Connection conn = DBConnection.getDBConnection();

        try {
            String query = "select * from team";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}