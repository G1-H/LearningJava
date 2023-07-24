package exercise.chapter_55;

public class OuterClassTest1 {
    public static void main(String[] args) {
        //일반 중첩 클래스
        OuterClass outerClass = new OuterClass(20);
        OuterClass.InnerClass innerClass = outerClass.new InnerClass(10);
        innerClass.display();

        //정적 중첩 클래스
        OuterStaticClass.InnerClass innerClass2 = new OuterStaticClass.InnerClass(15);

        innerClass2.display();
    }
}
