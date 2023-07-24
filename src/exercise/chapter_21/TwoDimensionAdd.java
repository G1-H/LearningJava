package exercise.chapter_21;

import java.util.Arrays;

public class TwoDimensionAdd {
    public static void main(String[] args) {
        int[][] arr1 = {
                {12, 100, 25, 33},
                {70, 23, 401, 110},
                {40, 65, 340, 81}
        };

        int[][] arr2 = {
                {15, 20, 25, 30},
                {20, 30, 40, 50},
                {60, 65, 70, 80}
        };

        int[][] resultArr = new int[3][4];

        for(int i = 0 ; i <arr1.length; i++) {
            for(int j = 0 ; j<arr1[i].length; j++){
                resultArr[i][j] = arr1[i][j]+arr2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(resultArr));

    }
}
