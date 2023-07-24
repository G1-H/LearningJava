package exercise.chapter_63;

import exercise.chapter_59.Customer;

import java.util.List;

public class ListUtils {
    public synchronized static void addList(List<Customer> customerList, Customer newCustomer) {
        customerList.add(newCustomer);
    }
}
