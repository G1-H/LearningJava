package exercise.chapter_35;

public class Drone implements Flyable{
    private String droneID;
    private long remainingFuelAmount;
    private long remainingFileStorage;

    public void takePicture(){
        Flyable.printLanding();
        System.out.println("이 드론은 사진을 찍고 있습니다.");
    }
}
