package mission.week2.day4Mission2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public class Order {
    private int id;
    private Optional<Customer> customer;
    private LocalDate orderDate;
    private OrderStatus status;
    private Optional<List<OrderItem>> orderItems;

    public Order(int id, Customer customer, String orderDate, String status, List<OrderItem> orderItems) {
        this.id = id;
        this.customer = Optional.ofNullable(customer);
        this.orderDate = LocalDate.parse(orderDate,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.status = OrderStatus.valueOfOrderStatus(status);
        this.orderItems = Optional.ofNullable(orderItems);
    }


    public OrderStatus getStatus() {
        return status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Optional<List<OrderItem>> getOrderItems() {
        return orderItems;
    }

    public Optional<Customer> getCustomer() {return customer;}

}
