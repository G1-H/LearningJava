package exercise.chapter_32.fish;

public class FishChild extends Fish {
    private boolean eatable;
    protected String leavingSeaChild;


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
    void printSea(){
        System.out.println(myInfo()+"는 " + this.leavingSeaChild+" 바다 출신이고, 부모 물고기는 "+super.leavingSea+ "바다 출신이야");
    }



    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }


    public void setLeavingSeaChild(String leavingSea) {
        this.leavingSeaChild = leavingSea;
    }

    FishChild(){
        super();
    }

    public FishChild(boolean eatable, String leavingSea) {
        this.eatable = eatable;
        super.leavingSea = leavingSea;
    }

    FishChild(String sex, boolean eatable, String leavingSea){
        super(sex, false, "2022", "2022", leavingSea);
        this.eatable = eatable;
    }
}
