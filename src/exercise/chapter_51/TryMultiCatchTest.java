package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatchTest {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("src/exercise/chapter_51/test.txt");

            int i = 1;
            int data = 100 / i;

            String str = "hi";
            System.out.println(str.toUpperCase());

            int index = 15;
            int[] intArr = new int[10];
            System.out.println(intArr[index]);

        } catch (FileNotFoundException e) {
            System.out.println("Can't find file");
            e.printStackTrace();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("NullPointException or ArithmeticException DETECTED");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("최종 Exception 필터에 걸렸습니다.");
            e.printStackTrace();
        }
//        catch (NullPointerException e) {
//            System.out.println("null point exception");
//            e.printStackTrace();
//        }
        System.out.println("end main method");
    }
}
