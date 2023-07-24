package exercise.chapter_19;

public class Gugudan {
    public static void main(String[] args) {
        for (int dan = 2; dan <= 9; dan++) {
            for (int gob = 1; gob <= 9; gob++) {
                System.out.printf("%d * %d = %2d%n", dan, gob, dan * gob);
            }
            System.out.printf("%n");
        }
    }
}
