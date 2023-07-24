package exercise.chapter_52;

import exercise.chapter_52.exceptions.IDFormatException;
import exercise.chapter_52.exceptions.PositiveNumberException;

public class PTMember {
    private String ID;
    private String name;
    private Integer height;
    private Integer weight;
    private String gender;

    public PTMember(String name, Integer height, Integer weight, String gender) {
        if(height<=0) throw new PositiveNumberException("키는 0 이하일 수 없습니다.");
        if(weight<=0) throw new PositiveNumberException("몸무게는 0 이하일 수 없습니다.");
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public void setID(String ID) {
        if(ID==null) throw new IDFormatException("ID는 null이 될 수 없습니다.");
        if(!(8<ID.length()&&ID.length()<20)) throw new IDFormatException("ID는 8자 이상, 20 미만 이여야 합니다.");
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "PTMember{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
}
