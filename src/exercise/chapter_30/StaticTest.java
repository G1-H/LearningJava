package exercise.chapter_30;

public class StaticTest {
    public static void main(String[] args) {
        //클래스 변수
        int num = Student.getSerialNum();
        String city = Student.city;
        Student.setSerialNum(100);

        Student student1 = new Student("Alice", "Female");
        Student student2 = new Student("Tom", "Male");
        Student student3 = new Student("Kelly", "Male");
        Student student4 = new Student("Jane", "Female");

        student1.printMyInfo();
        student2.printMyInfo();
        student3.printMyInfo();
        student4.printMyInfo();


    }
}
