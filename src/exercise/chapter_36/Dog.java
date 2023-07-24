package exercise.chapter_36;

public class Dog extends Animal {
    @Override
    public void eat(String food) {
        System.out.printf("강아지는 %s를 와구와구 먹고 있습니다.\n",food);
    }

    @Override
    public void sleep() {
        System.out.printf("강아지는 코를 골며 자고 있습니다.\n");
    }
}
