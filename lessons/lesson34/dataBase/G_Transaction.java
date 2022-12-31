package lessons.lesson34.dataBase;

import java.sql.*;

public class G_Transaction {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:shop.db";
        try (
                Connection conn = DriverManager.getConnection(url);
                )
        {
            conn.setAutoCommit(false);
            try (
                    Statement stmt = conn.createStatement();
                    )
            {
//                stmt.execute("insert into customers (cnum, cname, city, rating, snum) values (3001, 'Jackson', 'Prague', 100, 1001);");
              /*  stmt.execute("insert into orders (onum, amt, odate, cnum, snum) values (6001, 123, 2022-12-19, 3001, 1001);");*/
//                conn.commit();

                stmt.execute("insert into customers (cnum, cname, city, rating, snum) values (4001, 'Ferguson', 'Berlin', 100, 1001);");
                System.err.println(4/0);
                stmt.execute("insert into orders (onum, amt, odate, cnum, snum) values (7001, 1001, 2022-12-19, 4001, 1001);");
                conn.commit();
            }
        }
        catch (SQLException e) {
            System.err.println(e);
        }
    }
}
