package exercise.chapter_52;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PushExceptionTest {
    public static void main(String[] args){
        try {
            printFile("src/exercise/chapter_52/test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void printFile(String filename) throws IOException {
        FileInputStream fs = getFileStream(filename);
        int i;
        while ((i = fs.read()) != -1) {
            System.out.write(i);
        }
    }
    static FileInputStream getFileStream(String filename) throws FileNotFoundException {
        FileInputStream fs = new FileInputStream(filename);
        return fs;
    }
}
