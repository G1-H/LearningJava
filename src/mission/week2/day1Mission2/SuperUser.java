package mission.week2.day1Mission2;

public class SuperUser extends User implements CustomerRole,ReviewerRole,AdminRole{
    public SuperUser(String userName){
        super(userName);
    }
}
