package exercise.chapter_31;

public class SeaSituation {
    public static void main(String[] args) {
        Fish fish1 = new Fish();
        fish1.setSex("Male");
        fish1.setHavingPoison(false);
        fish1.setLeavingSea("동해");

        FishChild fish2 = new FishChild();
        fish2.setSex("Female");
        fish2.setHavingPoison(false);
        fish2.setLeavingSea("속초");

        fish2.becomeDanger();
        System.out.println("독성여부 : " + fish2.isHavingPoison());

        fish1.eat("새우");
        fish2.eat("새우");
        System.out.println(fish2.isEatable());
    }
}
