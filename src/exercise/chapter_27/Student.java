package exercise.chapter_27;

public class Student {
    private String schoolName;
    private int classYear;
    private int classRoomNumber;
    private int studentNumber;
    private String name;
    private String gender;

    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.getName();
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

    public String getName(){
        return this.name;
    }
}
