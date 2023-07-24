package mission;

public class MovieAgeRestriction {
    public static void main(String[] args) {
        int age = 19;
        String alarmText = new String();
        if (age < 0) alarmText = "유아 관람불가;";
        if (0 <= age && age < 12) alarmText = "전체 관람가";
        if (12 <= age && age < 15) alarmText = "12세 이상 관람가";
        if (15 <= age && age < 19) alarmText = "15세 이상 관람가";
        if (age >= 12) alarmText = "청소년 관람불가";

        System.out.printf("당신의 나이는 %d 세로, %s 영화까지 관람하실 수 있습니다.", age, alarmText);
    }

}
