package exercise.chapter_33;

public class AnimalDownCasting {
    public static void main(String[] args) {
        Animal animal = new Bird();
        checkBirdAndFly(animal);

        Animal animal2 = new Animal();
        checkBirdAndFly(animal2);
//        Bird bird2 = (Bird) animal2;
//
        Animal animal3 = new Person();
        checkBirdAndFly(animal3);
//        Bird bird3 = (Bird)animal3;
    }
    static void checkBirdAndFly(Animal animal){
        if(animal instanceof Bird){
            Bird bird = (Bird) animal;
            bird.fly();
        }else {
            System.out.println("너는 새가 아니야");
        }
    }
}
