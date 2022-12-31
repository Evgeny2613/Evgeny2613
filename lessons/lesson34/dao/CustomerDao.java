package lessons.lesson34.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {

    private static final String url = "jdbc:sqlite:shop.db";

    Customer findById(int cnum) throws SQLException {
        try (
                Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement("select * from customers where cnum = ?");
        ) {
            pstmt.setInt(1, cnum);
            try (
                    ResultSet rs = pstmt.executeQuery();
            ) {
                if (rs.next())
                    return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
            }

        }
        return null;
    }

    Customer add(Customer customer) throws SQLException {
        try (
                Connection conn = DriverManager.getConnection(url);
                PreparedStatement prstmt = conn.prepareStatement("insert into customers (cnum, cname, city, rating, snum) values (?, ?, ?, ?, ?);");
        ) {
            prstmt.setInt(1, customer.getCnum());
            prstmt.setString(2, customer.getCname());
            prstmt.setString(3, customer.getCity());
            prstmt.setString(4, customer.getCity());
            prstmt.setInt(5, customer.getSnum());
            int rowsAffected = prstmt.executeUpdate();

            if (rowsAffected == 1)
                return customer;
        }
        return null;
    }

    Customer update(Customer customer) throws SQLException {
        try (
                Connection conn = DriverManager.getConnection(url);
                PreparedStatement prstmt = conn.prepareStatement("update customers set cname = ?, city = ?, rating = ?, snum =? where cnum = ?;");
        ) {
            prstmt.setString(1, customer.getCname());
            prstmt.setString(2, customer.getCity());
            prstmt.setInt(3, customer.getRating());
            prstmt.setInt(4, customer.getSnum());

            prstmt.setInt(5, customer.getCnum());

            int rowsAffected = prstmt.executeUpdate();
            if (rowsAffected == 1)
                return customer;
        }
        return null;
    }

    void delete(Customer customer) throws SQLException {
        try (
                Connection conn = DriverManager.getConnection(url);
                PreparedStatement deleteStatement = conn.prepareStatement("delete from customers where cnum = ?;");
        ) {
            deleteStatement.setInt(1, customer.getCnum());
            deleteStatement.execute();
        }
    }

    List<Customer> getAllByCity() throws SQLException {
        List<Customer> customers = new ArrayList<>();
        try (
                Connection conn = DriverManager.getConnection(url);
                Statement selectStatement = conn.createStatement();
                ResultSet rs = selectStatement.executeQuery("select * from customers where ");
        ) {
                while (rs.next()) {
                    customers.add(new Customer(
                            rs.getInt("cnum"),
                            rs.getString("cname"),
                            rs.getString("city"),
                            rs.getInt("rating"),
                            rs.getInt("snum")

                    ));
                }
                return customers;

        }
    }
}
