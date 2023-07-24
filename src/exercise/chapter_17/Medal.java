package exercise.chapter_17;

public class Medal {
    public static void main(String[] args) {
        int myRank =4;
        String medal;

        switch (myRank) {
            case 1:
                medal = "금메달";
                break;
            case 2:
                medal = "은메달";
                break;
            case 3:
                medal = "동메달";
                break;
            default:
                medal = "메달없음";
        }
        System.out.printf("선수님은 %d등으로 %s입니다.",myRank,medal);
    }
}
