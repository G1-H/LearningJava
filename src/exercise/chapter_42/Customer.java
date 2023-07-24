package exercise.chapter_42;

public class Customer {
    static int serialNums = 1;


    protected String customerID;
    protected String name;
    protected String customerGrade;

    protected int bonusPoint;
    protected double bonusPointRatio;

    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

    public Customer(){}


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
}
