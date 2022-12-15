package lessons.lesson34.dataBase;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A_CreateDatabase {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:shop.db";

        try (
                Connection conn = DriverManager.getConnection(url);
                )
        {
            DatabaseMetaData metaData = conn.getMetaData();
            System.out.println("The driver is: " + metaData.getDriverName());
            System.out.println("The data base was created");
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }
}
