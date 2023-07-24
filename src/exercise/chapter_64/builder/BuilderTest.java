package exercise.chapter_64.builder;

public class BuilderTest {

    public static void main(String[] args){
        // 적용 전
        User user1 = new User("John", "Doe", 30, "johndoe@example.com");

        System.out.println("적용 전 User: " + user1);
        // 적용 후
        User user2 = new User.UserBuilder()
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .email("johndoe@example.com")
                .build();

        System.out.println("적용 후 User: " + user2);

    }
}
