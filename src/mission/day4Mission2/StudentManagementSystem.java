package mission.day4Mission2;

import java.util.Arrays;

public class StudentManagementSystem {
    private Student[] studentsList;

    public void addStudent(Student student) {
        Student[] tempArray = Arrays.copyOf(this.studentsList, this.studentsList.length + 1);
        tempArray[tempArray.length - 1] = student;
        this.studentsList = tempArray;
        System.out.printf("학생 추가 : %s\n", student.getName());
        System.out.println(Arrays.toString(this.studentsList));
    }

    public void searchStudent(int studentCode) {
        boolean flag = false;
        for (Student s : this.studentsList) {
            if (s.getStudentCode() == studentCode){
                if(!s.isRemoveOrNOt()){
                    System.out.printf("학생을 찾았습니다.\n이름:%s\n학번:%d\n전공:%s\n학년:%d\n", s.getName(), s.getStudentCode(), s.getMajor(), s.getGradeYear());
                    flag = true;
                }else{
                    System.out.println("삭제된 학생\n");
                    flag = true;
                }
            }
        }
        if(!flag)
            System.out.println("해당 학생을 찾을 수 없습니다.");
    }
    public void removeStudent(Student student){
        for(Student s : this.studentsList){
            if(s==student){
                s.setRemoveOrNOt(true);
            }
        }
    }

    public StudentManagementSystem() {
        studentsList = new Student[0];
    }
}
