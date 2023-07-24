package exercise.chapter_26;

public class Student {
    String schoolName;
    int classYear;
    int classRoomNumber;
    int studentNumber;
    String name;
    String gender;

    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.name;
        System.out.printf("%s :저는 %s 선생님에게 %s 과목을 배우고 있습니다.\n",name, teacherName, subjectName);
    }

    Student() {
    }

    Student(String pSchoolName, int pClassYear, int pClassRoomName, int pStudentNum, String pName, String pGender) {
        schoolName = pSchoolName;
        classYear = pClassYear;
        classRoomNumber = pClassRoomName;
        studentNumber = pStudentNum;
        name = pName;
        gender = pGender;
    }
}
