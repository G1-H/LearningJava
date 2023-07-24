package exercise.chapter_17;

public class Taxi {
    public static void main(String[] args) {
        int goHomeTime =2;
        String myHome = "용인";
        int payment =25_000;

        if(0<=goHomeTime && goHomeTime<=4){
            payment = payment + (int)(payment*0.2);
        }
        if(myHome.equals("서울")){
            payment = payment + (int) (payment*0.2);
        }

        System.out.printf("고객님이 내셔야 할 돈은 %d 입니다.",payment);

    }
}
