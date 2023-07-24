package exercise.chapter_58;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        String content = "\n이것은 파일 컨텐츠입니다.";
        try (FileWriter fos = new FileWriter("src/exercise/chapter_58/output_korean.txt",true)) {
            fos.write(content);

            System.out.println("output.txt 파일이 생성되었습니다.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
