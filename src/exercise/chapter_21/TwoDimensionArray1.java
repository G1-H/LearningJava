package exercise.chapter_21;

import java.util.Arrays;

public class TwoDimensionArray1 {
    public static void main(String[] args) {
        //2d array
        int[][] arr1 = new int[2][5];
        int[][] arr2 = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));

        int myInt = arr2[0][2];
        int myInt2 = arr2[2][1];
        System.out.println(myInt);
        System.out.println(myInt2);

        arr2[2][3] = 999;
        System.out.println(Arrays.deepToString(arr2));

        for(int i = 0 ; i<arr2.length; i++){
            for(int j = 0 ; j<arr2[i].length;j++){
                System.out.printf("%d ", arr2[i][j]);
            }
            System.out.println();
        }

    }
}
