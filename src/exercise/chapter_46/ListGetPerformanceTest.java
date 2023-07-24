package exercise.chapter_46;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListGetPerformanceTest {
    static final int SIZE = 100_000;
    public static void main(String[] args) {

        //List ArrayList 구현
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
        }

        // List LinkedList 구현
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < SIZE; i++) {
            linkedList.add(i);
        }

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arrayList.get(i);
        }

        endTime = System.currentTimeMillis();
        System.out.println("ArrayList get 요청 걸린 시간 : "+ (endTime-startTime) +"ms");

        startTime = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            linkedList.get(i);
        }

        endTime = System.currentTimeMillis();
        System.out.println("LinkedList get 요청 걸린 시간 : "+ (endTime-startTime) +"ms");
    }
}
