package lessons.lesson34.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class B_CreateTables {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:shop.db";
        try
                (
                        Connection conn = DriverManager.getConnection(url); // соединение с базой данных
                        Statement smtm = conn.createStatement(); // запрос который можно послать в базу

                        )
        {
            smtm.execute("create table if not exists salespeople (snum int primary key not null, sname text not null, city \n" +
                    "text not null, comm integer not null);");
            smtm.execute("create table if not exists customers (cnum int primary key not null, cname text not null, city \n" +
                    "text not null, rating integer not null, snum int not null);");
            smtm.execute("create table if not exists orders (onum int primary key not null, amt int not null, odate text \n" +
                    "not null, cnum int not null, snum int not null);");
            System.out.println("Tables created");
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
