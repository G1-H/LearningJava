package exercise.chapter_57;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOpsTest {
    public static void main(String[] args) {


        // List ( 미리 복사해오기 )
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Strawberry");


        // filter: fruit 이름의 길이가 6 이상인 과일만 선택
        fruits.stream()
                .filter(i -> i.length() >= 6)
                .forEach(i -> System.out.println("filter 적용 : " + i));

        // distinct: 중복된 과일 제거
        List<String> distinctFruits = fruits.stream()
                .distinct().collect(Collectors.toList());

        System.out.println("fruits : " + fruits);
        System.out.println("disticntFruits : " + distinctFruits);

        // map: 과일 이름을 대문자로 변환
        List<String> fruitListMap = fruits.stream()
                .map(fruit -> fruit.toUpperCase())
                .collect(Collectors.toList());

        List<Integer> fruitListMap2 = fruits.stream()
                .map(fruit -> fruit.length())
                .collect(Collectors.toList());

        System.out.println("map 이후 " + fruitListMap);
        System.out.println("map 이후(2) " + fruitListMap2);

        // limit: 처음 3개의 과일만 선택
        List<String> fruitListLimit = fruits.stream()
                .limit(3).collect(Collectors.toList());
        System.out.println("Limit 이후 : " + fruitListLimit);

        // skip: 처음 3개의 과일을 제외한 나머지 과일 선택
        List<String> fruitListSkip = fruits.stream()
                .skip(5).collect(Collectors.toList());
        System.out.println("skip 이후 : " + fruitListSkip);

        // sorted: 과일을 알파벳 순으로 정렬
        List<String> fruitListSorted = fruits.stream().sorted()
                .collect(Collectors.toList());
        System.out.println("기본 정렬 후 : " + fruitListSorted);

        // sorted: String 길이 짧은순 으로 정렬
        List<String> fruitListSortedByStringLength = fruits.stream()
                .sorted((fruit1, fruit2) -> fruit1.length() - fruit2.length())
                .collect(Collectors.toList());

        System.out.println("글자 길이로 정렬 후 : " + fruitListSortedByStringLength);
    }
}
