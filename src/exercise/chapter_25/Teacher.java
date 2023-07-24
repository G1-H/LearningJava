package exercise.chapter_25;

public class Teacher {
    String schoolName;
    Subject subject;
    String name;
    String gender;

    void teach(Student student, Subject subject){
        String studentName = student.name;
        System.out.printf("선생: %s학생에게 %s 과목을 가치고 있습니다.\n",studentName,subject.subjectName);
    }
}
