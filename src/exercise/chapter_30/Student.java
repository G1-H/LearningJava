package exercise.chapter_30;

import exercise.chapter_28.Teacher;

public class Student {
    private static int serialNum = 1;
    static String city = "Seoul";
    private String schoolName;
    private int classYear;
    private int classRoomNumber;
    private int studentNumber;
    private String name;
    private String gender;
    private int studentID;

    //정적 메소드

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int num) {
        serialNum = num;
    }

    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.getName();
        System.out.printf("%s :저는 %s 선생님에게 %s 과목을 배우고 있습니다.\n", name, teacherName, subjectName);
    }
    public void printMyInfo(){
        System.out.printf("[Student] name : %s, gender ; %s, studentID : %d\n",this.name,this.gender,this.studentID);
    }

    Student() {
    }
    Student(String name, String gender){
        this("School", 1, 3, 01, name, gender);
    }
    Student(String schoolName, int classYear, int classRoomName, int studentNum, String name, String gender) {
        this.studentID = serialNum++;
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
