package mission.week2.day3Mission2;

public abstract class CollegeStudent {
    public String schoolYear;
    private String studentNumber;
    private String studentName;
    private double grade;

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public CollegeStudent(String studentNumber, String studentName, double grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        String result =String.format("%s{studentNumber='%s',name='%s',gpa=%.2f}",this.schoolYear,this.studentNumber,this.studentName,this.grade);
        return result;
    }
}
