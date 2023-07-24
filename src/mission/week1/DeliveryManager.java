package mission.week1;

public class DeliveryManager {
    private String name;
    private long salesAmount;


    public String getName() {
        return name;
    }

    public void sayDeliveryDetail(int day, int cost){
        System.out.printf("[딜러버리 매니저 %s] 배송 예상 일수는 %d 일이고, 배송 요금은 %d 원입니다.\n",this.name, day, cost);
    }
    public void deliverGoing(int day, int cost){
        System.out.printf("[딜리버리 매니저 %s] 배송은 %d일 뒤 받아보실 수 있을 거에요. %d 원 결제해드리겠습니다.\n",this.name, day, cost);
    }
    public void addSalesAmount(int cost){
        this.salesAmount += cost;
        System.out.println("[딜러버리 매니저 매상 추가 / 딜리버리 매니저 잔고 "+this.salesAmount+"]");
    }

    public DeliveryManager(String name, long salesAmount){
        this.name = name;
        this.salesAmount = salesAmount;
    }
}
