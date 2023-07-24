package exercise.chapter_46;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();
//        add
        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Kiwi");
        System.out.println("fruitList :" + fruitList);
//        add(index, value)
        fruitList.add(3, "Mango");
        System.out.println("fruitList :" + fruitList);
//        remove
        fruitList.remove(3);
        System.out.println("fruitList :" + fruitList);
//        get
        String myFruit = fruitList.get(3);
        System.out.println("가져온 과일 : " + myFruit);
//        set : 해당 인덱스의 값 변경
        fruitList.set(1, "PineApple");
        System.out.println("fruitList :" + fruitList);
        System.out.println(fruitList.size());
//        isEmpty : 빈 리스트인지 판단
        List<String> fruitList2 = new ArrayList<>();
        System.out.println(fruitList.isEmpty());
        System.out.println(fruitList2.isEmpty());
//        Contains : 리스트에 해당 원소가 있는지 없는지 확인하는 메서드
        System.out.println(fruitList.contains("Apple"));
        System.out.println(fruitList.contains("Kiwi"));
//        indexOf: 해당 값 인덱스 .. 없으면 -1
        String myFruit2 = "Orange";
        System.out.println(fruitList.indexOf(myFruit2));
        String myFruit3 = "Apple";
        System.out.println(fruitList.indexOf(myFruit3));
//        clear : 리스트 비우기
        fruitList.clear();
        System.out.println("fruitList :" + fruitList);

    }
}
