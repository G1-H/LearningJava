package exercise.chapter_35;

public class Airplane implements Flyable{
    private String airplaneID;
    private long remainFuelAmount;
    private long maximumCapacity;

    @Override
    public void fly() {
        System.out.println("비행기ID("+airplaneID+") 가 납니다.");
    }

    public void refillFuel(long fuel){
        remainFuelAmount += fuel;
    }

    public Airplane(String airplaneID) {
        this.airplaneID = airplaneID;
    }
}
