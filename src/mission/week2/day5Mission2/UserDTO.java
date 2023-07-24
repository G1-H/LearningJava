package mission.week2.day5Mission2;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private String userName;


    private String userRole;

    public UserDTO(String userName, String userRole) {
        this.userName = userName;
        this.userRole = userRole;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserRole() {
        return userRole;
    }
}
