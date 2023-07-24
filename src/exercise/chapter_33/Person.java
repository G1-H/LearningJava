package exercise.chapter_33;

public class Person extends Animal{
    private String name;
    private String job;
    private int height;

    @Override
    public void eat(String food) {
        System.out.printf("사람이 %s을 젓가락을 이용해 먹습니다.\n", food);
    }

    @Override
    public void sleep() {
        System.out.println("사람이 침대에서 잠을 자고 있습니다.");
    }
    public void run(){
        System.out.println("사람이 두발로 뛰어가고 있습니다.");
    }
}
