package exercise.chapter_51;

public class TryCatchFinallyTest {

    public static void main(String[] args) {
        System.out.println("start main method");

        try {
            Integer myInt = null;
            Integer data = 100 / myInt;

            System.out.println("data: " + data);
        } catch (ArithmeticException e) {
            System.out.println("MyInt는 0이 될 수 없습니다.");
            e.printStackTrace();
        }finally { // 예외가 발생하든, 발생하지 않든, 리턴으로 main이 끝나도. 실행되는 영역
            System.out.println("여기는 무조건 실행되는 Finally 영역입니다.");
        }

        System.out.println("finish main method");
    }
}
