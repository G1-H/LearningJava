package exercise.chapter_55;

public class LocalTest {
    public static void main(String[] args) {
        //지역 내부 클래스
        class LocalWalk implements Walkable {
            @Override
            public void walk() {
                System.out.println("LocalWalk: walking");
            }
        }

        LocalWalk localWalk = new LocalWalk();
        localWalk.walk();

        //익명클래스
        Walkable anonymousWalk = new Walkable() {
            @Override
            public void walk() {
                System.out.println("AnonymousWalk : walking");
            }
        };

        anonymousWalk.walk();
    }
}
