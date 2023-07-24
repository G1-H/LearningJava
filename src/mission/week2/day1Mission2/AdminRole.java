package mission.week2.day1Mission2;

public interface AdminRole {
    default void manageUsers(){
        System.out.println("슈퍼유저("+this.getUserName()+")은 유저를 매니징 할 수 있습니다.");
    }
    default void changeSettings(){
        System.out.println("슈퍼유저("+this.getUserName()+")은 세팅을 변경할 수 있습니다.");
    }
    String getUserName();
}
