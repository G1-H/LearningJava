package exercise.chapter_14;

public class StringFormat {
    public static void main(String[] args) {
        String str1 = "Happy";
        String str2 = String.valueOf(123);

        String result;

        result = String.format("문자 서식 : %s, %S", str1, str1);
        System.out.println(result);

        int myInt = 10;

        result = String.format("정수 서식 : %05d", myInt);
        System.out.println(result);

        float myFloat = 3.141592f;
        result = String.format("실수 서식 : %f, %.1f, %.2f, %.3f", myFloat, myFloat, myFloat,myFloat);
        System.out.println(result);
    }
}
