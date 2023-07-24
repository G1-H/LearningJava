package exercise.chapter_34;

public class Staff {
    private int salesAmount;

    public int helpPayment(Customer customer, int price){
        return customer.calculatePrice(price);
    }
//    public int helpPayment(VIPCustomer customer, int price){
//        return customer.calculatePrice(price);
//    }

    public void addSaleAmount(int price){
        salesAmount += price;
    }

    public void printMySalesAmount(){
        System.out.println("오늘의 최종 매상은 " + this.salesAmount + "원 입니다.");
    }

    public void setSalesAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }
}
