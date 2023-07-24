package exercise.chapter_29;

public class Customer {
    //속성
    private long cashAmount;
    private String myFeeling;

    //행위
    public void askCoffee(Cashier cashier, String coffeeName) {
        System.out.printf("손님 : %s 얼마인가요?\n", coffeeName);
    }

    public long withdrawCash(long amount) {
        this.cashAmount -= amount;
        return amount;
    }

    public void orderCoffee(String coffeeName, boolean isWrappedUp) {
        System.out.printf("손님 : %s을 주문할게요. 단, 포장 여부는 %b입니다.\n", coffeeName, isWrappedUp);
    }

    public void drinkCoffee(Coffee coffee) {
        String coffeeName = coffee.getCoffeeName();
        System.out.printf("손님 : ( %s 를 마신다.)\n", coffeeName);
    }

    public void upgradeMyFeeling() {
        this.myFeeling = "좋아졌네요.";
    }

    public void showMyFeeling(){
        System.out.printf("손님 : 저의 기분은 %s\n",this.myFeeling);
    }

    public void setCashAmount(long cashAmount) {
        this.cashAmount = cashAmount;
    }

    public void setMyFeeling(String myFeeling) {
        this.myFeeling = myFeeling;
    }
}
