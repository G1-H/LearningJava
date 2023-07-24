package exercise.chapter_31;

public class FishChild extends Fish{
    private boolean eatable;

    public void digging(){
        System.out.println(myInfo()+"가 땅을 파고 있습니다.");
    }

    public void becomeDanger(){
        this.havingPoison =true;
    }
    @Override
    void eat(String food){
        System.out.printf("%s, 물고기는 %s를 매우 열심히 먹고 있어요.\n",myInfo(), food);
    }

    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }


}
