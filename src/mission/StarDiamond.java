package mission;

public class StarDiamond {
    public void makeDiamond(int num) {
        //상단 부분 별 찍기
        for (int row = 1; row <= num; row++) {
            for (int blank = num - row; blank > 0; blank--) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //하단 부분 별 찍기
        for (int row = 1; row <= num - 1; row++) {
            for (int blank = 0; blank < row; blank++) {
                System.out.print(" ");
            }
            for (int star = 2 * (num - row) - 1; star > 0; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StarDiamond sd = new StarDiamond();
        sd.makeDiamond(3);
        sd.makeDiamond(5);
        sd.makeDiamond(10);
    }
}
