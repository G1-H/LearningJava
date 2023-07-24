package exercise.chapter_26;

public class InstanceTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Bob";
        student1.gender = "Male";
        student1.schoolName = "Elite";
        student1.classYear = 1;
        student1.classRoomNumber = 3;
        student1.studentNumber = 18;

        System.out.println(student1.name);
        System.out.println(student1.gender);
        System.out.println(student1.studentNumber);

        Student student2 = new Student();
        student2.name = "Alice";
        student2.gender = "Female";
        student2.schoolName = "Elite";
        student2.classYear = 1;
        student2.classRoomNumber = 3;
        student2.studentNumber = 21;

        System.out.println(student2.name);
        System.out.println(student2.gender);
        System.out.println(student2.studentNumber);

        Student student3 = new Student();
        System.out.println(student3.name);
        System.out.println(student3.gender);
        System.out.println(student3.studentNumber);

        Student student4 = new Student("Elite", 1, 3, 12, "Jiwon", "Male");
        System.out.println(student4.name);
        System.out.println(student4.gender);
        System.out.println(student4.studentNumber);

        Teacher teacher = new Teacher("Lilly","Female","언어","AB001");


        System.out.println(teacher.name);
        System.out.println(teacher.gender);
        System.out.println(teacher.subject.subjectName);
        System.out.println(teacher.subject.subjectCode);

    }
}
