package exercise.chapter_53;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DayEnumTest {
    public static void main(String[] args) {
        //각각 Enum값 정의
        //Ordianl, compareTo, vlaues

        Day monday = Day.MONDAY;
        Day sunday = Day.SUNDAY;
        Day thursday = Day.THURSDAY;

        System.out.println("ordinal 값 : " + monday.ordinal()); //1
        System.out.println("ordinal 값 : " + sunday.ordinal()); //0
        System.out.println("ordinal 값 : " + thursday.ordinal()); //4

        System.out.println("CompareTo: " + monday.compareTo(sunday)); // ordinal 값 빼서 대소비교 1
        System.out.println("CompareTo: " + monday.compareTo(thursday));// ordinal 값 빼서 대소비교 -3

        Day[] days = Day.values();//enum요소 배열로
        System.out.println("Days : " + Arrays.toString(days)); //Days : [SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY]
    }
}
