package exercise.chapter_13;

public class ExplicitCasting {
    public static void main(String[] args){
        float myFloat = 5.55f;
        int myInt = (int) myFloat;
        System.out.println(myInt);

        double myDouble1 = 5.5;
        double myDouble2 = 3.7;
        int result = (int) (myDouble1+myDouble2);
        System.out.print(result);

    }
}
