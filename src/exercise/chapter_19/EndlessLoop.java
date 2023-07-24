package exercise.chapter_19;

public class EndlessLoop {
    public static void main(String[] args) {
        //tip : 분 단위로 계산.
        final int WAKE_UP = 8 * 60;
        final int END_DAY = 24 * 60;

        int now = WAKE_UP;
        System.out.println("공부하기 싫다. 30분부터 해야지 ");
        while (now < END_DAY) {
            now++;
            if (now % 60 == 0) System.out.printf("지금 시간은 %d 정각이네!", now / 60);
            if(now/60 == 10) break;
            if (now % 60 == 34) {
                System.out.println("헐 34분이잖아.");
                System.out.println("그럼 정각부터 해야겠다.");
            }
            if (now % 60 == 8) {
                System.out.println("헐 8분이잖아.");
                System.out.println("하.. 30분부터 해야겠다.");

            }

        }
    }
}
