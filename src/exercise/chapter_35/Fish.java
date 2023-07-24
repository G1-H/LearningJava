package exercise.chapter_35;

public class Fish extends Animal {
    private boolean havingPoison;
    private String leavingSea;

    @Override
    public void eat(String food) {
        System.out.printf("물고기가 %s를 뻐끔뻐금하며 먹습니다.\n", food);
    }

    @Override
    public void sleep() {
        System.out.println("물고기가 물 속에서 잠을 자고 있습니다.");
    }

    public void swim(){
        System.out.println("물고기가 물 속에서 헤엄치고 있습니다.");
    }
}
