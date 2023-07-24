package exercise.chapter_42;

import java.util.TreeMap;

public class GarbageCollectorTest {
    public static void main(String[] args) throws InterruptedException {
        Customer[] customers = new Customer[100];
        for (int i = 0; i < 100; i++) {
            Customer customer = new Customer("장민철");
            customers[i] = customer;
        }
        System.gc();
        for (Customer c : customers) {
            c.printMyInfo();
        }
        System.out.println(Integer.parseInt(" 01"));
        while (true) {
            Thread.sleep(100);
        }

    }
}
