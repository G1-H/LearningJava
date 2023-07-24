package exercise.chapter_65.meta;

public class AnnotationTest {

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        AnnotationUtils.executeMethodsByRepeatAnnotation(myObj);
    }
}
