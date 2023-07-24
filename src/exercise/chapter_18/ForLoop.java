package exercise.chapter_18;

public class ForLoop {
    public static void main(String[] args) {
        // 1~10 더하기
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.printf("1~10까지 더한 수는 %d 입니다.", sum);
    }
}
