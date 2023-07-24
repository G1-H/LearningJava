package exercise.chapter_58;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        int i;
        StringBuilder sb = new StringBuilder();
        try {
            while( (i = System.in.read()) != '\n'){
                sb.append((char) i);
            }
            System.out.println("InputStream 적용 전 출력 :" +sb);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int j;
        StringBuilder sb2 = new StringBuilder();
        try(InputStreamReader isr = new InputStreamReader(System.in)) {
            while( (j = isr.read()) != '\n'){
                sb2.append((char) j);
            }
            System.out.println("InputStream 적용 후 출력 :" +sb2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
