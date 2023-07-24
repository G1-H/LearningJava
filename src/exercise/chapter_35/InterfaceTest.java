package exercise.chapter_35;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.atmosphereLimit);

        //Flyable
        Flyable bird = new Bird();
        Flyable airplane = new Airplane("AB123");

        bird.fly();
        airplane.fly();

        //Walkable
        Walkable person = new Person("jiwon");
        Walkable robot = new Robot("Robo12");


        person.walk();
        robot.walk();

        if (robot instanceof Robot) {
            Robot robot2 = (Robot) robot;
            if (person instanceof Person){
                Person person2 = (Person) person;
                robot2.helpPerson(person2);
            }
        }
    }
}
