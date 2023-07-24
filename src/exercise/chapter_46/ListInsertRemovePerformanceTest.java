package exercise.chapter_46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInsertRemovePerformanceTest {

    static final int SIZE = 100_000;

    public static void main(String[] args) {
        long startTime;
        long endTime;

        //List ArrayList 구현
        List<Integer> arrayList = new ArrayList<>();

        startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
            if(i%5==0) arrayList.remove(0);
        }

        endTime = System.currentTimeMillis();
        System.out.println("ArrayList 삽입/삭제 요청 걸린 시간 : " + (endTime - startTime) + "ms");

        // List LinkedList 구현
        List<Integer> linkedList = new LinkedList<>();

        startTime = System.currentTimeMillis();


        for (int i = 0; i < SIZE; i++) {
            linkedList.add(i);
            if(i%5==0) linkedList.remove(0);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList 삽입/삭제 요청 걸린 시간 : " + (endTime - startTime) + "ms");




    }
}
