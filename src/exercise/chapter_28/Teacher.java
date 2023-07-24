package exercise.chapter_28;

public class Teacher {
    String schoolName;
    private Subject subject;
    private String name;
    private String gender;

    void teach(Student student, String subjectName){
        String studentName = student.getName();
        System.out.printf("선생 %s: %s학생에게 %s 과목을 가치고 있습니다.\n",name,studentName,subjectName);
    }
    Teacher(){};
    Teacher(String name, String gender, String subjectName, String subjectCode){
        this.name = name;
        this.gender = gender;

        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setSubjectCode(subjectCode);
        this.subject= subject;
    }

    //getter
    public String getName(){
        return this.name;
    }
}
