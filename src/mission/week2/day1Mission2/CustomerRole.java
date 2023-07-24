package mission.week2.day1Mission2;

public interface CustomerRole {
    default void order(){
        System.out.println("유저("+this.getUserName()+")은 주문을 할 수 있습니다.");
    }
    default void payment(){
        System.out.println("유저("+this.getUserName()+")은 결제를 할 수 있습니다.");
    }
    String getUserName();
}
