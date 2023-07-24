package exercise.chapter_47;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {
    public static void main(String[] args) {
        //Map 정의
        Map<String, Integer> fruitMap = new HashMap<>();

        //Map에 데이터 넣음
        fruitMap.put("Orange", 5);
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 3);
        fruitMap.put("Kiwi", 20);

        System.out.println("fruitMap : "+fruitMap);//fruitMap : {Apple=10, Kiwi=20, Orange=5, Banana=3}

        //get(key)
        Integer appleCount = fruitMap.get("Apple");
        Integer bananaCount = fruitMap.get("mango");

        System.out.println("사과 갯수: "+appleCount);//사과 갯수: 10
        System.out.println("바나나 갯수: "+bananaCount);//바나나 갯수: 3

        //contains(key)
        Boolean isApple = fruitMap.containsKey("Apple");
        Boolean isMango = fruitMap.containsKey("Mango");
        System.out.println(isApple); //true
        System.out.println(isMango); //false

        //remove(key)
        fruitMap.remove("Apple");
        System.out.println("fruitMap : "+fruitMap);//fruitMap : {Kiwi=20, Orange=5, Banana=3}

        //size
        System.out.println("fruitMap 사이즈 : "+fruitMap.size()); //fruitMap 사이즈 : 3

        //keySet
        System.out.println(fruitMap.keySet());//[Kiwi, Orange, Banana]



    }
}
