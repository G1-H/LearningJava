package exercise.chapter_44;

public class StringCharArrayTest {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c'};
        String str1 = new String(chars);
        String str2 = String.valueOf(chars);

        System.out.println(str1);
        System.out.println(str2);

        char[] char2 = str1.toCharArray();
        for (char c : char2) {
            System.out.println(c);
        }

    }
}
