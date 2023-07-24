package mission.day5.mission1;

import java.util.Arrays;

public class StudentScore {
    //static 필드
    private static int serialIndex = 0;
    private static int[] allScores;

    //static 메소드
    public static int[] getAllScores(){
        return allScores;
    }
    public static void addScoreToAllScores(int score){
        if(allScores==null){
            allScores = new int[1];
            allScores[0] = score;
        }else{
            int length = allScores.length;
            allScores = Arrays.copyOf(allScores,length+1);
            allScores[length] = score;
        }
    }
    //객체 변수

    private int myIndex;

    private int score;
    //객체 변수 Getter, Setter

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        allScores[this.myIndex]=score;
    }
    //생성자
    public StudentScore(int score) {
        this.score = score;
        this.myIndex = serialIndex++;
        addScoreToAllScores(score);
    }
}
