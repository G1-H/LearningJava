package exercise.chapter_52;

public class ThrowUncheckException {
    public static void main(String[] args) {
        System.out.println("START main method");

        int myInt = 0;
        try {
            myInt = getIntElement(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("myInt: " + myInt);

        int myInt2 = 0;
        try {
            myInt2 = getDivide(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("myInt2: "+myInt2);

        System.out.println("FINISH main method");


    }

    static int getIntElement(int index) throws Exception {
        int[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        if (index >= arrInt.length) {
            throw new Exception("Index는 ArrInt의 길이를 넘을 수 없습니다.");
        }
        return arrInt[index];
    }

    static int getDivide(int num) throws Exception{
        if (num == 0) {
            throw new Exception("num은 0이 될 수 없습니다.");
        }
        return  (100 / num);

    }
}
