package exercise.chapter_28;

public class Student {
    private String schoolName;
    private int classYear;
    private int classRoomNumber;
    private int studentNumber;
    private String name;
    private String gender;

    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.getName();
        System.out.printf("%s :저는 %s 선생님에게 %s 과목을 배우고 있습니다.\n", name, teacherName, subjectName);
    }

    Student() {
    }

    Student(String schoolName, int classYear, int classRoomName, int studentNum, String name, String gender) {
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.classRoomNumber = classRoomName;
        this.studentNumber = studentNum;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }
}
