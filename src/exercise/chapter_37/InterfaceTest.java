package exercise.chapter_37;

public class InterfaceTest {
    public static void main(String[] args) {
        HusbandRole male = new Male("철수");
        Wife wife = new Female("영희");
        Baby baby = new Baby("민수");

        male.sayLoveEveryDay();
        male.takeCareWife(wife);

        DaddyRole maleDaddy = (DaddyRole) male;
        maleDaddy.educateBaby(baby);
        maleDaddy.sayLoveEveryDay();

        EmployeeRole maleEmployee = (EmployeeRole) male;
        EmployeeRole maleEmployee2 = new MaleTwo("민재");
        maleEmployee.workTogether(maleEmployee2);
    }
}
