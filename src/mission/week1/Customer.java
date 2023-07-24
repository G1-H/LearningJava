package mission.week1;

public class Customer {
    private long cashAmount;
    private String feeling;
    private Object[] shoppingList;

    private boolean likeDelivery;

    public void askSneakers(Staff staff, Sneaker sneaker) {
        System.out.printf("[고객] %s님, %s 신발에 대해 알려주세요.\n", staff.getName(),sneaker.getBrand());
    }

    public void checkCash(long price) {
        if (cashAmount >= price) {
            System.out.println("[고객] 구매 진행할게요.");

        } else {
            System.out.print("[고객] 다음에 올게요.");
            updateFeeling("돈이 부족해서 아쉬움");
            sayMyStates();
        }
    }
    public boolean checkCashForDelivery(long price){
        if (cashAmount >= price) {
            System.out.println("[고객] 배송해주세요.");
            return true;
        } else {
            System.out.println("[고객] 아.. 그럼 환불해주세요.");
            updateFeeling("돈이 모자라 아쉬움");
            return false;
        }
    }

    public void refund(long price){
        cashAmount += price;
        System.out.println("[고객 환불 받음]");
        System.out.print("[고객] 다음에 올게요.");
        sayMyStates();
    }

    public void sayPurchase() {
        System.out.println("[고객] 구매 진행할게요");
    }

    public void updateFeeling(String feeling) {
        this.feeling = feeling;
    }

    public void purchase(long price){
        this.cashAmount -= price;
        System.out.println("[고객 지불]");
    }

    public void getItem(Object o){
        if(this.shoppingList == null){
            this.shoppingList = new Object[1];
            this.shoppingList[0] = o;
        }else{
            Object[] tempList = new Object[this.shoppingList.length+1];
            for(int i = 0 ; i < this.shoppingList.length ; i++){
                tempList[i] = this.shoppingList[i];
            }
            tempList[this.shoppingList.length] = o;
            this.shoppingList = tempList;
        }
    }

    public void wearSneaker(){
        for(Object o : this.shoppingList){
            if(o instanceof Sneaker){
                System.out.printf("[고객] %s 신발을 신어보니, %s 특성 때문에 기분이 좋아졌어요.",((Sneaker) o).getBrand(),((Sneaker) o).getFeature());
                updateFeeling("새로운 신발이 맘에 들어 좋음");
            }
        }
        sayMyStates();
    }

    public void sayNextTime(){
        System.out.print("[고객] 그럼, 다음에 올게요.");
    }

    public void sayMyStates() {
        System.out.printf("(기분은 %s, 현재 잔고는 %s)\n",feeling,cashAmount);
    }

    public boolean isLikeDelivery() {
        return likeDelivery;
    }

    public Customer(long cashAmount, String myFeeling, boolean likeDelivery){
        this.cashAmount  = cashAmount;
        this.feeling = myFeeling;
        this.likeDelivery = likeDelivery;
    }



}
