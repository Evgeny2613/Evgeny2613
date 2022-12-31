package lessons.lesson34.dao;

import java.sql.SQLException;

public class TestDao {
    public static void main(String[] args) throws SQLException {
        CustomerDao customerDao = new CustomerDao();
//        Customer johnSmith = new Customer(8001, "John Smith", "Brussels", 100, 1001);
//        johnSmith = customerDao.add(johnSmith);
//        List<Customer> customers = customerDao.getAll();
//        customers.forEach(System.out::println);
//        System.out.println("-----------");

//        Customer johnSmith = customerDao.findById(8001);
//        johnSmith.setCity("Warsaw");
//        johnSmith = customerDao.update(johnSmith);
//        List<Customer> customers = customerDao.getAll();
//        customers.forEach(System.out::println);

        SalesDao salesDao = new SalesDao();

//        Sales john = new Sales(1001, "John", "Toronto", 17);
//        salesDao.add(john);
//        System.out.println(salesDao.getById(john.getSnum()));
//
//        System.out.println(salesDao.getAllByCity("New York"));

        OrderDao orderDao = new OrderDao();
        Order order = new Order(7004, 12456, "2022-12-22", 2008, 1007);
//        System.out.println(orderDao.add(order));
        order.setAmt(7000);
        System.out.println(orderDao.addOrUpdate(order));

    }
}
