package exercise.chapter_37;

public abstract class FamilyMale implements FamilyRole{
    protected String name;

    @Override
    public void educateBaby(Baby baby) {
        String name = baby.getName();
        System.out.println(name + "아기를 열심히 교육 중에 있습니다.");
    }

    @Override
    public void takeCareWife(Wife wife) {
        String name = wife.getName();
        System.out.println(name +"인 아내를 성심성의껏 케어합니다.");
    }


}
