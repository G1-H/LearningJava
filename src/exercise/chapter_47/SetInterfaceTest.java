package exercise.chapter_47;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceTest {

    public static void main(String[] args) {
        //Set interface
        Set<String> fruitSet = new HashSet<>();

        //add
        fruitSet.add("Orange");
        fruitSet.add("Apple");
        fruitSet.add("Mango");
        fruitSet.add("Grape");

        System.out.println("fruitSet : "+ fruitSet);//fruitSet : [Apple, Grape, Mango, Orange] 순서가 맞지 않음

        //중복 add시
        fruitSet.add("Apple");
        System.out.println("fruitSet : "+ fruitSet);//fruitSet : [Apple, Grape, Mango, Orange] 중복값 대입 안댐

        //remove
        fruitSet.remove("Apple");
        System.out.println("fruitSet : "+ fruitSet);//fruitSet : [Grape, Mango, Orange] 중복값 대입 안댐

        //contains
        System.out.println("Apple 있는지? "+fruitSet.contains("Apple")); // false
        System.out.println("Mango 있는지? "+fruitSet.contains("Mango"));// true

        //size, isEmpty, clear
        System.out.println("size : " + fruitSet.size()); //3
        fruitSet.clear();
        System.out.println("isEmpty? "+ fruitSet.isEmpty()); //true
    }


}
