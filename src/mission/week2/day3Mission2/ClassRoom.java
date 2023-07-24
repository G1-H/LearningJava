package mission.week2.day3Mission2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ClassRoom<T extends CollegeStudent> {
    private String className;
    private HashMap<String, T> classStudentsList;

    public ClassRoom(String className) {
        this.className = className;
        this.classStudentsList = new HashMap<>();
    }

    public void addStudent(T student) {
        classStudentsList.put(student.getStudentNumber(), student);
    }

    public String getStudentByStudentNumber(String studentNumber) {
        if (classStudentsList.get(studentNumber) == null) {
            return "찾을 수 없습니다.";
        } else return this.classStudentsList.get(studentNumber).toString();
    }

    public ArrayList<String> getAllStudentsName() {
        ArrayList<String> allStudentNameList = new ArrayList<>();
        if (classStudentsList.isEmpty()) {
            return null;
        } else {
            for (Map.Entry<String, T> entry : classStudentsList.entrySet()) {
                allStudentNameList.add(entry.getValue().getStudentName());
            }
            return allStudentNameList;
        }
    }

    public void printStudentNames() {
        if (this.getAllStudentsName() == null) {
            System.out.println("이 클래스 룸(" + this.className + ")은 학생들이 없습니다.");
        }

        System.out.println("이 클래스 룸(" + this.className + ")은 학생들" + this.getAllStudentsName() + "가 있습니다.");
    }



}
