package lessons.lesson34.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E_Update {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:shop.db";
        try (
                Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement();
                )
        {
            int rowsAffected = stmt.executeUpdate("update salespeople set comm = comm + 2 ;"); //кол-во затронутых изменением строк
            System.out.println("Table updated, rows affected: " + rowsAffected);
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
