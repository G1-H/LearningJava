package exercise.chapter_21;

import java.util.Arrays;

public class ArrayCopyTwo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //for loop
        int[] arr1 = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            arr1[i] = arr[i];
        }
        //Arrays.copyOf()
        int[] arr2 = Arrays.copyOf(arr, arr.length);

        //clone()
        int[] arr3 = arr.clone();

        arr[2] = 1000;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }
}
