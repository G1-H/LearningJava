package exercise.chapter_20;


import java.util.Arrays;

public class ArrayDeclaration {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int[] intArray2 = new int[]{1,2,3,4,5};
        int[] intArray3 = {1,2,3,4,5};

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));

        float[] floatArray = new float[10];
        float[] floatArray2 = {1.5f, 2.5f, 3.5f};
        System.out.println(Arrays.toString(floatArray));
        System.out.println(Arrays.toString(floatArray2));

        boolean[] booleans = new boolean[5];
        boolean[] booleans1 = {true, false, true};
        System.out.println(Arrays.toString(booleans));
        System.out.println(Arrays.toString(booleans1));

        char[] charArray = new char[5];
        char[] charArray1 = {'a','B','r'};
        System.out.println(Arrays.toString(charArray));
        System.out.println(Arrays.toString(charArray1));

        String[] stringArray = new String[5];
        String[] stringArray1 = {"hello", "world"};

        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(stringArray1));
    }
}
