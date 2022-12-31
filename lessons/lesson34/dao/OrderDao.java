package lessons.lesson34.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDao {

    private static final String url = "jdbc:sqlite:shop.db";

    // Selecting the orders of particular sales representative
    List<Order> ordersBySaleRep(int snum) {
        List<Order> ordersBySales = new ArrayList<>();
        try (
                Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement("select * from orders where snum = ?;")
        ) {
            pstmt.setInt(1, snum);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ordersBySales.add(
                        new Order(
                                rs.getInt("onum"),
                                rs.getInt("amt"),
                                rs.getString("odate"),
                                rs.getInt("cnum"),
                                rs.getInt("snum")
                        )
                );
            }

            return ordersBySales;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return null;
    }

    Order add(Order order) {
        try (
                Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement("INSERT INTO orders (onum, amt, odate, cnum, snum) VALUES (?, ?, ?, ?, ?);");
        ) {
            pstmt.setInt(1, order.getOnum());
            pstmt.setInt(2, order.getAmt());
            pstmt.setString(3, order.getOdate());
            pstmt.setInt(4, order.getCnum());
            pstmt.setInt(5, order.getSnum());

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected == 1)
                return order;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return null;
    }

    Order update(Order order) {
        try (
                Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement("UPDATE orders SET onum = ?, amt = ?, odate = ?, cnum = ?, snum = ?;");
                ) {
            pstmt.setInt(1, order.getOnum());
            pstmt.setInt(2, order.getAmt());
            pstmt.setString(3, order.getOdate());
            pstmt.setInt(4, order.getCnum());
            pstmt.setInt(5, order.getSnum());

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected == 1)
                return order;
        }
        catch (SQLException e) {
            System.err.println(e);
        }
        return order;
    }


    Order addOrUpdate(Order order) {
            order = update(order);
            if (order != null)
                return order;
            else
                return add(order);
    }
}
