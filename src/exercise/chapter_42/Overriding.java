package exercise.chapter_42;
class Parent{
    protected void overrideTest(){
        System.out.println("부모 클래스 메소드입니다.");
    }
}
class Child extends Parent{
    public void overrideTest(){
        System.out.println("자식 클래스에서 작성된 메소드입니다.(오버라이딩)");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        parent.overrideTest();
        child.overrideTest();

    }
}
