import java.sql.*;

public class DBConnect { // We create a SQL connection.
    public static final String DB_URL = "jdbc:mysql://localhost/employees";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        // We create an object from the SQL Connection class.
        Connection connect = null;
        Statement statement = null;
        // The SQL operation we want to do.
        String sql = "SELECT * FROM employees";
        try {
            // We create a database connection.
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            // We put the statement we created in an object.
            statement = connect.createStatement();
            // To pull data.
            ResultSet data = statement.executeQuery(sql);
            // With the while loop, we circulate the data and print it to the console.
            while (data.next()) {
                System.out.println("ID: " + data.getInt("id"));
                System.out.println("Name: " + data.getString("name"));
                System.out.println("Position: " + data.getString("position"));
                System.out.println("Salary: " + data.getInt("salary"));
                System.out.println("=============================================");
            }
            statement.close();
            data.close();
        } catch (SQLException e) { // We capture the error messages and print them to the console.
            System.out.println(e.getMessage());
        }
    }
}
