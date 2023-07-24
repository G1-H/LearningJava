package exercise.chapter_57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        //Stream.of
        Stream<String> fruits = Stream.of("Apple", "Banana", "Orange");
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Arrays.stream
        Stream<String> fruits2 = Arrays.stream(new String[]{"Apple", "Banana", "Orange"});
        Stream<Integer> integerStream2 = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});


        //Collection  -> stream
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");

        Stream<String> fruit3 = fruitList.stream();

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i + 1);
        }
        Stream<Integer> integerStream3 = integerList.stream();

        //stream for loop
        //기본 리스트 for 루프
        for (String fruit : fruitList) {
            System.out.println("for-loop로 산출 : "+fruit.toUpperCase());
        }
        //forEach
        fruits.forEach((fruit)-> System.out.println("forEach로 산출 : " +fruit.toUpperCase()));
        //filter
        integerStream.filter((i)->i%2==0).filter(i->i>4).forEach(i -> System.out.println(i));


    }

}
