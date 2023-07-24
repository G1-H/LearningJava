package exercise.chapter_54;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {
    public static void main(String[] args) {
        //현재 시간 출력하기
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate past = LocalDate.of(2022,12,07);
        System.out.println(past);
        System.out.println(past.getDayOfWeek());

        //날짜 포맷 바꾸기
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        String dateStr = past.format(dateTimeFormatter);
        System.out.println(past);
        System.out.println(dateStr);

    }
}
