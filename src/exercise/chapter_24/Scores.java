package exercise.chapter_24;

public class Scores {
    public static void main(String[] args) {
        // A class students scores
        int studentAClass1 = 50;
        int studentAClass2 = 30;
        int studentAClass3 = 45;

        // B class students scores
        int studentBClass1 = 60;
        int studentBClass2 = 65;
        int studentBClass3 = 66;

        //Average
//        int sumAClass = studentAClass1 + studentAClass2 + studentAClass3;
        double averageAClass = calculateAverage(studentAClass1,studentAClass2,studentAClass3);
//        int sumBClass = studentBClass1 + studentBClass2 + studentBClass3;
        double averageBClass = calculateAverage(studentBClass1,studentBClass2,studentBClass3);
        System.out.printf("A 학급의 평균 점수는 %.2f, B 학급의 평균 점수는 %.2f 입니다.",averageAClass,averageBClass);
    }

    static double calculateAverage(int score1, int score2, int score3){
        int sum = score1 + score2 + score3;
        double average = sum / (double) 3;

        return average;
    }
}
