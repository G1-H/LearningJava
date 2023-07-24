package exercise.chapter_58;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try (FileReader fis = new FileReader("src/exercise/chapter_58/text_korean.txt")) {
            int i ;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
