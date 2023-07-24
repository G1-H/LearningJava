package exercise.chapter_21;

import java.util.Arrays;

public class TwoDimensionArrayCopy {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int[][] arr1 = arr.clone();

        arr[0][0] = 100;
        System.out.println(Arrays.deepToString(arr)); //[[100, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
        System.out.println(Arrays.deepToString(arr1)); //[[100, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]] 얕은 복사가 됨.

        int[][] arr2 = new int[arr.length][];
        for(int row = 0; row < arr.length ; row++){
            arr2[row] = arr[row].clone();
        }
        arr[0][1] = 999;
        System.out.println(Arrays.deepToString(arr)); //[[100, 999, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
        System.out.println(Arrays.deepToString(arr2)); //[[100, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]] 깊은 복사가 됨.

    }
}
