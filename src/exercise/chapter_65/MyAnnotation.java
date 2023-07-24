package exercise.chapter_65;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.CONSTRUCTOR})
public @interface MyAnnotation {
    String name();

    int count() default 0;

}
