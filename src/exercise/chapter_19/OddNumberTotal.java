package exercise.chapter_19;

public class OddNumberTotal {
    public static void main(String[] args) {
        int total = 0;
        for(int i  =1 ; i <=10 ; i++){
            if(i%2==0) continue;
            total +=i;
        }
        System.out.println(total);
    }
}
