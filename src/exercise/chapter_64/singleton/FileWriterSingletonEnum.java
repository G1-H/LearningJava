package exercise.chapter_64.singleton;

import java.io.FileWriter;
import java.io.IOException;

public enum FileWriterSingletonEnum {
    INSTANCE;

    private FileWriter fileWriter;

    {
        try {
            fileWriter = new FileWriter("src/exercise/chapter_64/singleton/test.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //git test

    public void writeToFile(String message){
        try {
            fileWriter.write(message + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
