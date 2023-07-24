package mission.week2.day5Mission2;

public class AdminUser extends User{
    public static final String USER_ROLE = "ADMIN";

    public AdminUser(String userName) {
        super(userName);

    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "userName='" + userName + '\'' +
                ", userRole='" + USER_ROLE + '\'' +
                '}';
    }
}
