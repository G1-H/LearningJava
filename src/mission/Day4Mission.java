package mission;

import java.util.Arrays;

public class Day4Mission {

    private static boolean powOfTwo(int arrLength){
        String binaryString = Integer.toBinaryString(arrLength);
        boolean result =false;
        int sum = 0;
        for(char c : binaryString.toCharArray()){
            if(c=='1') sum++;
        }
        if(binaryString.charAt(0)=='1'&&sum==1) result = true;
        return result;
    }
    private static int[] returnArray(int[] arr){
        int[] result ;
        int wins = Integer.toBinaryString(arr.length).length();
        if(powOfTwo(arr.length)){
            result = Arrays.copyOf(arr,arr.length);
        }else{
            result = Arrays.copyOf(arr,(int)Math.pow(2,wins));
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] result1= Day4Mission.returnArray(arr1);
        System.out.println(Arrays.toString(result1));

        int[] arr2 = {58, 172, 746, 89};
        int[] result2= Day4Mission.returnArray(arr2);
        System.out.println(Arrays.toString(result2));

        int[] arr3 = {9, 8, 7};
        int[] result3= Day4Mission.returnArray(arr3);
        System.out.println(Arrays.toString(result3));

        int[] arr4 = {411, 22, 33, 44, 55, 66, 77, 88, 99, 1111, 2222, 333, 4444, 2222, 333, 4444, 2222, 333, 4444, 2222, 333, 4444, 2222, 333, 4444};
        int[] result4= Day4Mission.returnArray(arr4);
        System.out.println(Arrays.toString(result4));

    }
}
