package exercise.chapter_50;

public class TryCatchTest1 {
    public static void main(String[] args) {
        System.out.println("main method start");
        try { //예외가 발생할 수 있을 것 같은 실행부
            int i = 0;
            int data = 50 / i;
            System.out.println("data:" + data);
        } catch (ArithmeticException e) { //예외가 발생한다면 실행할 실행부
            e.printStackTrace();
            System.out.println("0으로 나눌 수가 없습니다.");
            System.out.println("data: " + 0);
        }

        // 중요한 로직 (예외 처리를 하지 않는다면, 위에서 예외가 발생할 경우에 중요한 로직이 실행되지 못한다.)
        System.out.println("main method end");

    }
}
