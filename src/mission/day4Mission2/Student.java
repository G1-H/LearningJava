package mission.day4Mission2;

public class Student {
    private String name;
    private int studentCode;
    private String major;
    private int gradeYear;
    private boolean removeOrNOt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }

    public boolean isRemoveOrNOt() {
        return removeOrNOt;
    }

    public void setRemoveOrNOt(boolean removeOrNOt) {
        this.removeOrNOt = removeOrNOt;
    }

    public Student(String name, int studentCode, String major, int gradeYear) {
        this.name = name;
        this.studentCode = studentCode;
        this.major = major;
        this.gradeYear = gradeYear;
        this.removeOrNOt = false;
    }
}
