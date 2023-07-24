package exercise.chapter_39;

public class GoldCustomer extends Customer {

    private double discountRatio;

    @Override
    public int calculatePrice(int price) {
        this.bonusPoint += price*bonusPointRatio;
        price -= price*discountRatio;
        return price;
    }

    public GoldCustomer(String name){
        super();
        this.customerID="Customer"+ Customer.serialNums++;
        this.name= name;
        this.customerGrade="GOLD";
        this.bonusPoint = 0;
        this.bonusPointRatio=0.03;
        this.discountRatio=0.03;
    }
}
