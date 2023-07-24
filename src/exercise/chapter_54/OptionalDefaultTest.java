package exercise.chapter_54;

import java.util.Optional;

public class OptionalDefaultTest {
    public static void main(String[] args) {
        String str = null;

        Optional<String> optionalS = Optional.ofNullable(str);

        int length = optionalS.orElseGet(() -> "").length();
        System.out.println(length);

    }
}
