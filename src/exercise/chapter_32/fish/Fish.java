package exercise.chapter_32.fish;

public class Fish {
    // 멤버 변수(=클래스 필드)
    private String sex;
    protected boolean havingPoison;
    private String startSpawningDate;
    private String endSpawningDate;
    protected String leavingSea;


    // 멤버 함수(=클래스 메소드)
    void eat(String food) {
        System.out.printf("%s, 물고기는 %s를 먹고 있어요.\n", myInfo(), food);
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

    String myInfo() {
        return String.format("물고기(sex=%s, havingPosition=%b, leavingSea=%s)",
                this.sex, this.havingPoison, this.leavingSea);
    }

    void printfMyInfo() {
        System.out.println(myInfo());
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHavingPoison(boolean havingPoison) {
        this.havingPoison = havingPoison;
    }

    public boolean isHavingPoison() {
        return havingPoison;
    }

    public void setStartSpawningDate(String startSpawningDate) {
        this.startSpawningDate = startSpawningDate;
    }

    public void setEndSpawningDate(String endSpawningDate) {
        this.endSpawningDate = endSpawningDate;
    }

    public void setLeavingSea(String leavingSea) {
        this.leavingSea = leavingSea;
    }

    Fish() {}

    public Fish(String sex, boolean havingPoison, String startSpawningDate, String endSpawningDate, String leavingSea) {
        this.sex = sex;
        this.havingPoison = havingPoison;
        this.startSpawningDate = startSpawningDate;
        this.endSpawningDate = endSpawningDate;
        this.leavingSea = leavingSea;
    }
}
