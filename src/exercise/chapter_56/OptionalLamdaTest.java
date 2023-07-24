package exercise.chapter_56;

import java.util.Optional;

public class OptionalLamdaTest {
    public static void main(String[] args) {
        String str = null;
        Optional<String> stringOptional = Optional.ofNullable(str);

        String str2 = stringOptional.orElseGet(() -> "DEFAULT").toUpperCase();
        System.out.println(str2);

        String str3 = stringOptional.orElseThrow(() -> {throw new CustomException("customerException 입니다");}).toUpperCase();
        System.out.println(str3);

    }


}
