package exercise.chapter_65.meta;

public class MyClass {

    @Repeat(value = 20)
    public void printMessage() {
        System.out.println("Hello, world!");
    }

    @Repeat
    public void foo() {
        System.out.println("This is another method.");
    }

}
