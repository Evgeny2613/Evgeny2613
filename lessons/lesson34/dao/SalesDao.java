package lessons.lesson34.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SalesDao {
    private static final String url = "jdbc:sqlite:shop.db";

    Sales getById(int snum) {
        try (
                Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM salespeople WHERE snum = ?");
                ){
            pstmt.setInt(1, snum);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next())
                return new Sales(
                        rs.getInt("snum"),
                        rs.getString("sname"),
                        rs.getString("city"),
                        rs.getInt("comm")
                        );

        }
        catch (SQLException e) {
            System.err.println(e);
        }
        return null;
    }

    Sales add(Sales sales) {
        try (
                Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement("insert into salespeople (snum, sname, city, comm) values (?, ?, ?, ?);");
                )
        {
            pstmt.setInt(1, sales.getSnum());
            pstmt.setString(2, sales.getSname());
            pstmt.setString(3, sales.getCity());
            pstmt.setInt(4, sales.getComm());
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected == 1)
                return sales;
        }
        catch (SQLException e) {
            System.err.println(e);
        }
        return null;
    }



     List<Sales> getAllByCity(String columnValue) {
        List<Sales> sales = new ArrayList<>();

        try (
                Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement("select * from salespeople where city = ?;");
                ){
            pstmt.setString(1, columnValue);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                sales.add(new Sales(
                                rs.getInt("snum"),
                                rs.getString("sname"),
                                rs.getString("city"),
                                rs.getInt("comm")
                        ));
            }
            return sales;
        }
        catch (SQLException e) {
            System.err.println(e);
        }
        return null;
    }

    }

