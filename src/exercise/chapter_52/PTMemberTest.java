package exercise.chapter_52;

import exercise.chapter_52.exceptions.IDFormatException;

public class PTMemberTest {
    public static void main(String[] args) {

        PTMember member = new PTMember("민철", 178, 70, "Male");
        try{
            member.setID("adbd");
        }catch (IDFormatException e){
            e.printStackTrace();
            e.getMessage();
            // 알림 메세지 날리는 로직
        }

        System.out.println(member);

    }


}
