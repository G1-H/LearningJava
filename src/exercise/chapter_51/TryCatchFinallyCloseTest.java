package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyCloseTest {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("start main method");

        try(FileInputStream fs= new FileInputStream("src/exercise/chapter_50/test.txt") ) {
            int i;
            while ((i = fs.read()) != -1) {
                System.out.write(i);
            }
            int myInt = 0;
            int data = 100 / myInt;

        } catch (FileNotFoundException e) {
            System.out.println("File을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("입출력 과정에서 문제가 생겼습니다.");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException execute");
            e.printStackTrace();
        }
        System.out.println("finish main method");
        while (true) { // 리소스 확인을 위한 무한 루프(메인 메서드 닫히지 않도록)
            Thread.sleep(1000);

        }
    }
}
