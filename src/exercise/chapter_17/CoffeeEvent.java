package exercise.chapter_17;

public class CoffeeEvent {
    public static void main(String[] args) {
        boolean clearCondition1 = true;
        boolean clearCondition2 = true;
        boolean clearCondition3 = true;
        boolean clearCondition4 = true;

//        if (clearCondition1) {
//            if (clearCondition2) {
//                if (clearCondition3) {
//                    if (clearCondition4) System.out.println("스타벅스 쿠폰 이벤트를 신청할 수 있습니다. ");
//                } else System.out.println("아니요 내돈내산으로 먹겠습니다.");
//            } else System.out.println("아니요 내돈내산으로 먹겠습니다.");
//        } else System.out.println("아니요 내돈내산으로 먹겠습니다.");

        if (clearCondition1 && clearCondition2 && clearCondition3 && clearCondition4)
            System.out.println("스타벅스 쿠폰 이벤트를 신청할 수 있습니다. ");
        else System.out.println("아니요 내돈내산으로 먹겠습니다.");

    }
}
