package exercise.chapter_35;

public class InterfaceTest2 {


    public static void main(String[] args) {
        Flyable drone = new Drone();
        Flyable airplane = new Airplane("ab123");
        drone.fly();
        airplane.fly();
        if(drone instanceof Drone){
            Drone drone2 = (Drone) drone;
            drone2.takePicture();
        }
    }
}
