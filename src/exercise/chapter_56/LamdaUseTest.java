package exercise.chapter_56;

public class LamdaUseTest {
    public static void main(String[] args) {
        MultipleNum multipleNum = (num) -> num * 10;
        MultipleNum multipleNum2 = (num) -> num * 20;

        printNum(multipleNum2);
        printNum((x) -> x * 50); // 함수 인자로 람다 활용

        // generic programming 활용
        GenericLamda<String> genericLamda1 = (str) -> str.toUpperCase();
        GenericLamda<Integer> genericLamda2 = (num) -> num * 2;
        GenericLamda<Boolean> genericLamda3 = (myBoolean) -> myBoolean & true;

        System.out.println(genericLamda1.calculate("abc"));
        System.out.println(genericLamda2.calculate(100));
        System.out.println(genericLamda3.calculate(false));
    }

    static void printNum(MultipleNum multipleNum) {
        int result = multipleNum.calculate(5);
        System.out.println(result);
    }
}
