package exercise.chapter_33;

public class Animal {
    protected String gender;

    public void eat(String food) {
        System.out.printf("동물이 %s을 먹습니다.\n", food);
    }
    public void sleep(){
        System.out.println("동물이 잠을 자고 있습니다.");
    }
}
