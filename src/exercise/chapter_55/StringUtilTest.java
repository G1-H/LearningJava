package exercise.chapter_55;

public class StringUtilTest {
    public static void main(String[] args) {
        String str = "Hello World!";
        char target = 'o';

        //1. 문자열이 비어 있는지 확인
        boolean isEmpty = StringUtils.isEmpty(str);
        System.out.println("str 비어 있나? " + isEmpty);

        //2.문자열 반대로 뒤집기
        String str2 = StringUtils.reverse(str);
        System.out.println("str 뒤집기 " + str2);

        //3. 주어진 문자열에 특정 문자의 개수 세기
        int countChar = StringUtils.CharChecker.countChar(str, target);
        System.out.println("특정 문자 갯수 세기  " + countChar);

        //4. 주어진 문자열에 문자 포함되어 있는지
        boolean isContained = StringUtils.CharChecker.containsChar(str, target);
        System.out.println("특정 문자 포함 되어 있는지? "+isContained);


    }
}
