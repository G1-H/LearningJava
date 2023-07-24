package exercise.chapter_35;

public class Robot implements Walkable{
    private String robotID;
    private String modelName;
    private String color;

    @Override
    public void walk() {
        System.out.printf("로봇ID %s가 걷고 있습니다.\n",this.robotID);
    }
    public void helpPerson(Person person){
        String name = person.getName();
        System.out.printf("로봇이 인간 %s를 도와주고 있습니다.\n",name);
    }

    public Robot(String robotID) {
        this.robotID = robotID;
    }
}
