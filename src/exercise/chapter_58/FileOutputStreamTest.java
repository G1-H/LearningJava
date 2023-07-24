package exercise.chapter_58;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        String content = "\nThis is content of File";
        try (FileOutputStream fos = new FileOutputStream("src/exercise/chapter_58/output.txt",true)) {
            byte[] bytes = content.getBytes();
            fos.write(bytes);

            System.out.println("output.txt 파일이 생성되었습니다.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
