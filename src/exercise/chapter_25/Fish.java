package exercise.chapter_25;

public class Fish {
    // 멤버 변수(=클래스 필드)
    String sex;
    boolean havingPoison;
    String startSpawningDate;
    String endSpawningDate;
    String leavingSea;


    // 멤버 함수(=클래스 메소드)
    void eat(String food) {
        System.out.printf("나, 물고기는 %s를 먹고 있어요.\n", food);
    }

    void swim(int meter) {
        System.out.println("나는 헤업칩니다. meter : " + meter + "\n");
    }

    void makeCrowd(Fish otherfish) {
        System.out.println("나는 다른 물고기와 무리 짓습니다.");
    }

    void sleep() {
        System.out.println("Zzz");
    }
}
