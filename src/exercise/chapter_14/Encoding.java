package exercise.chapter_14;

public class Encoding {
    public static void main(String[] args) {
        char ch1 = 'Z';
        System.out.println(ch1);
        System.out.println((int) ch1);

        int num = 66;
        System.out.println(num);
        System.out.println((char) num);

        char smallA = 'a';
        char largeA = 'A';
        boolean result = smallA > largeA;

        System.out.println(result);

        char hangul = '\uAC00';
        System.out.println(hangul);

        char special1 = '\t';
        System.out.println(special1);

        char special2 = '\n';
        System.out.println(special2);

        char special3 = '\'';
        System.out.println(special3);


//50724 45720 46020 32 54868 51060 54021 33 해석
        int int1 = 33;
        String int1Hex = Integer.toHexString(int1);
        System.out.println(int1Hex);

        char char1 = (char) 50724;
        char char1Hex = '\uc624';
        System.out.println(char1);
        System.out.println(char1Hex);

        char char2 = (char) 45720;
        char char2Hex = '\ub298';
        System.out.println(char2);
        System.out.println(char2Hex);

        char char3 = (char) 46020;
        char char3Hex = '\ub3c4';
        System.out.println(char3);
        System.out.println(char3Hex);

        char char4 = (char) 32;
        char char4Hex = '\u0020';
        System.out.println(char4);
        System.out.println(char4Hex);

        char char5 = (char) 54868;
        char char5Hex = '\ud654';
        System.out.println(char5);
        System.out.println(char5Hex);

        char char6 = (char) 51060;
        char char6Hex = '\uc774';
        System.out.println(char6);
        System.out.println(char6Hex);

        char char7 = (char) 54021;
        char char7Hex = '\ud305';
        System.out.println(char7);
        System.out.println(char7Hex);


        char char8 = (char) 33;
        char char8Hex = '\u0021';
        System.out.println(char8);
        System.out.println(char8Hex);

        System.out.printf("%c%c%c%c%c%c%c%c%n", char1, char2, char3, char4, char5, char6, char7, char8);


    }
}
