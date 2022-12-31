package lessons.lesson34.dataBase;

import java.sql.*;

public class H_AutoIncrement {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:shop.db";
        try (
                Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement();
                )
        {
            int rowsAffected = stmt.executeUpdate("insert into user (first, last) values  ('Lena', 'Semenova');");
            if (rowsAffected > 0) {
                try (
                        //запросить из таблицы БД идентификатор последней вставленной записи
                        ResultSet rs = stmt.getGeneratedKeys();
                        )
                {
                    if (rs.next()) {
                        int id = rs.getInt(1);
                        System.out.println("Inserted id: " + id);
                    }
                }
            }
        }
        catch (SQLException e) {
            System.err.println(e);
        }
    }
}
