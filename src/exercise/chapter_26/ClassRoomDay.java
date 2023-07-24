package exercise.chapter_26;

public class ClassRoomDay {
    public static void main(String[] args) {
        Student student1 = new Student("Elite", 1, 3, 20, "Bob", "Male");
        Student student2 = new Student("Elite", 1, 3, 21, "Alice", "Female");
        Student student3 = new Student("Elite", 1, 3, 25, "Belly", "Female");
        Student student4 = new Student("Elite", 1, 3, 40, "juliet", "Female");

        Teacher teacher = new Teacher("Lilly", "Female","언어", "AB001");

        String subjectName = "국어";

        teacher.teach(student1,subjectName);
        student1.study(teacher,subjectName);

        teacher.teach(student2,subjectName);
        student2.study(teacher,subjectName);

        teacher.teach(student3,subjectName);
        student3.study(teacher,subjectName);

        teacher.teach(student4,subjectName);
        student4.study(teacher,subjectName);

    }
}
