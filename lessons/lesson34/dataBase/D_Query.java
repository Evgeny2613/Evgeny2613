package lessons.lesson34.dataBase;

import java.sql.*;

public class D_Query {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:shop.db";
        try (
                Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from customers order by cname");
                PreparedStatement pstm = conn.prepareStatement("select * from salespeople where comm > ?;");
                )
        {
            while (rs.next()) {
                int customerNumber = rs.getInt("cnum");
                String customerName = rs.getString("cname");
                String customerCity = rs.getString("city");
                int rating = rs.getInt("rating");
                int salesNumber = rs.getInt("snum");

                System.out.printf("%10d|%10s|%10s|%5d|%5d\n", customerNumber, customerName, customerCity, rating, salesNumber );
            }



            pstm.setInt(1, 12); // передача параметра по позиции в ? Prepared statement
            ResultSet rsSales = pstm.executeQuery();
            System.out.println("\n" + "Sales with commision > 12");
            while (rsSales.next()) {
                int snum = rsSales.getInt("snum");
                String sname = rsSales.getString("sname");
                String salesCity = rsSales.getString("city");
                int comm = rsSales.getInt("comm");

                System.out.printf("%10d|%10s|%10s|%5d\n", snum, sname, salesCity, comm);
            }
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
