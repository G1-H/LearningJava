package exercise.chapter_13;

public class ImplicitCasting2 {
    public static void main(String[] args){
        int myInt = 10;
        double myDouble = 55.1;
        double result1 = myInt + myDouble;
        System.out.println(result1);

        long myLong = 20L;

        long result2 = myInt*myLong;
        System.out.println(result2);

        int number1 = 10;
        double number2 = 3.0;
        double result3 = number1/number2;

        System.out.println(result3);
    }
}
