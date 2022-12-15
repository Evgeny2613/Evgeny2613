package lessons.lesson34.dataBase;

import java.sql.*;

public class F_Delete {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:shop.db";
        try (
                Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from salespeople where city in ('London', 'San Jose');");
                PreparedStatement pstm = conn.prepareStatement("delete from salespeople where city in (?, ?);");
                )
        {
            System.out.println("Sales person to delete:");
            while (rs.next()) {
                int snum = rs.getInt("snum");
                String sname = rs.getString("sname");
                String city = rs.getString("city");
                int comm = rs.getInt("comm");

                System.out.printf("%10d|%10s|%10s|%5d\n", snum, sname, city, comm);
            }

                pstm.setString(1, "London");
                pstm.setString(2, "San Jose");
                pstm.execute();
                System.out.println("\nThe sales people were deleted");



        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
