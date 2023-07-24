package exercise.chapter_25;

public class Student {
    String schoolName;
    int classYear;
    int classRoomNumber;
    int studentNumber;
    String name;
    String gender;

    void study(Teacher teacher, Subject subject){
        String teacherName = teacher.name;
        System.out.printf("학생 :저는 %s 선생님에게 %s 과목을 배우고 있습니다.\n",teacherName,subject.subjectName);
    }
}
