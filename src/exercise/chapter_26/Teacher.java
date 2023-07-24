package exercise.chapter_26;

public class Teacher {
    String schoolName;
    Subject subject;
    String name;
    String gender;

    void teach(Student student, String subjectName){
        String studentName = student.name;
        System.out.printf("선생 %s: %s학생에게 %s 과목을 가치고 있습니다.\n", name, studentName, subjectName);
    }
    Teacher(){};
    Teacher(String pName, String pGender, String pSubjectName, String pSubjectCode){
        name = pName;
        gender = pGender;

        Subject subject = new Subject();
        subject.subjectName = pSubjectName;
        subject.subjectCode = pSubjectCode;
        this.subject= subject;
    }
}
