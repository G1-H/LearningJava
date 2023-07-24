package mission.week2.day5Mission2;

public class User {
    protected String userName;
    public final static String USER_ROLE = "USER";

    public User(String userName) {
        this.userName = userName;

    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userRole='" + USER_ROLE + '\'' +
                '}';
    }
}
