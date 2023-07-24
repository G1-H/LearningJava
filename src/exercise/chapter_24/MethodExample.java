package exercise.chapter_24;

public class MethodExample {
    //일반적인 입력값, 출력값 있는 경우
    // 둘 다 하나인 경우

    static int toUnicode(char ch) {
        return (int) ch;
    }

    // 입력값 여러개
    static int sumAndMultiplyFour(int a, int b) {
        return (a + b) * 4;
    }

    // 입력값이 없음, 출력값은 있음.
    static String sayHello(){
        return "Hello";
    }

    //입력값이 있음. 출력값은 없음.
    static void printText(String str){
        System.out.printf("함수 안에서 실행합니다. %s\n",str);
    }

    //입력값도 없고 출력값도 없음.
    static void printHello(){
        System.out.printf("hihi");
    }

    public static void main(String[] args) {
        char ch = 'A';
        int decode = toUnicode(ch);
        System.out.println(decode);

        int myInt1 = 10;
        int myInt2 = 5;
        int result = sumAndMultiplyFour(myInt1,myInt2);
        System.out.println(result);

        String res = sayHello();
        System.out.println(res);

        printText("printHello");
        printHello();
    }
}
