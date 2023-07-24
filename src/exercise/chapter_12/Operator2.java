package exercise.chapter_12;

public class Operator2 {
    public static void main(String[] args){
        // >, <, >=, <=, ==, !=
        int num1 = 10;
        int num2 = 20;

        boolean result = num1 > num2;
        System.out.println(result);

        //논리 연산자 : &&, ||, !
        boolean condition1 = 5>3;
        boolean condition2 = 4>4;

        boolean result2 = !(condition1 || condition2);
        System.out.println(result2);
    }
}
