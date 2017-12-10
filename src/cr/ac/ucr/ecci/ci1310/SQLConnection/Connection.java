package cr.ac.ucr.ecci.ci1310.SQLConnection;
import java.sql.*;

public class Connection {
    private String connectionURL;

    public Connection() {
        this.loadClass("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        this.connectionURL = "jdbc:sqlserver://localhost;database=BD_Universidad;integratedSecurity=true";
    }

    private void loadClass(String driverClass){
        try {
            Class.forName(driverClass);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public ResultSet execQuery(String query)
    {
        ResultSet resultSet = null;
        try {
            java.sql.Connection con = DriverManager.getConnection(this.connectionURL);

            // Create and execute an SQL statement that returns some data.
            String SQL = query;
            Statement statement = con.createStatement();
            resultSet = statement.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (resultSet.next())
            {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        return resultSet;
    }

    public static void main(String args[]) {
        Connection connection = new Connection();

        connection.execQuery("Select * from Asignado_a");
    }
}
