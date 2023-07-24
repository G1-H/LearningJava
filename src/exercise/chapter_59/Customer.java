package exercise.chapter_59;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {
    private final long serialVersionUID = 1L;
    static int serialNums = 1;
    protected String customerID;
    protected String name;
    protected String customerGrade;
    protected String job;
    protected int age;

    protected int bonusPoint;
    protected double bonusPointRatio;

    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

    public Customer() {
    }

    public Customer(String customerID, String name) {
        this(name);
        this.customerID = customerID;
    }

    public Customer(String customerID, String name, String job, int age) {
        this.customerID = customerID;
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public Customer(String name) {
        this.name = name;
        this.customerID = "Customer" + serialNums++;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    public void printMyInfo() {
        System.out.printf("Customer(customerID = %s, name = %s, customerGrade = %s, bonusPoint = %d\n",
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }

    @Override
    public String toString() {
        return String.format("Customer(customerID = %s, name = %s, customerGrade = %s, bonusPoint = %d)",
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Customer) {
            Customer customer = (Customer) obj;
            return customer.customerID == this.customerID;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.customerID);
    }
}
