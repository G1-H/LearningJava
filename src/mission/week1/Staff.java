package mission.week1;

public class Staff {
    private String name;
    private long salesAmount;


    public String getName() {
        return name;
    }

    public long sayAboutSneakerAndReturnPrice(Sneaker sneaker) {
        System.out.printf("[스태프 %s] 신발의 브랜드는 %s이고, 가격은 %d 원이며, 특징은 %s 입니다.\n",
                this.name, sneaker.getBrand(), sneaker.getPrice(), sneaker.getFeature());
        return sneaker.getPrice();
    }
    public boolean checkStockOfSneaker(Sneaker sneaker){
        return sneaker.isStockInStore();
    }
    public void saySneakerIsPossible(Sneaker sneaker){
        System.out.printf("[스태프 %s] 재고 확인해보니, %s신발 구매 가능하십니다.\n",this.name,sneaker.getBrand());
    }
    public void sayPaymentGoing(Sneaker sneaker){
        System.out.printf("[스태프 %s] 구매하시려는 %s 신발 결제 진행하겠습니다.\n", this.name,sneaker.getBrand());
    }
    public void announceDelivery(Sneaker sneaker){
        System.out.printf("[스태프 %s] 구매하시려는 %s 신발 재고가 없어, 배송으로 받아보실 수 있습니다.\n", this.name,sneaker.getBrand());
    }
    public void askDelivery(DeliveryManager deliveryManager, Sneaker sneaker){
        System.out.printf("[스태프 %s] 딜리버리 매니저 %s 님, %s 신발 배송 부탁드립니다. \n", this.name, deliveryManager.getName(), sneaker.getBrand());
    }
    public void addSalesAmount(long price){
        this.salesAmount += price;
        System.out.println("[스태프 매상 추가 / 현재 스태프 잔고 "+this.salesAmount+"]");
    }
    public void substractSalesAmount(long price){
        this.salesAmount-=price;
        System.out.println("[스태프 매상 차감 / 현재 스태프 잔고 "+this.salesAmount+"]");

    }

    public Staff(String name, long salesAmount) {
        this.name = name;
        this.salesAmount = salesAmount;
    }
}
