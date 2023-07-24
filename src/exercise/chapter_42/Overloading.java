package exercise.chapter_42;

public class Overloading {
    public void overload(int i){
        System.out.println("오버로드1");
    }
//    public boolean overload(int i){
//        System.out.println("오버로드2");
//        return true;
//    }  ** 리턴값 타입이 다른 것은 오버로딩 불가 (불가)
//    public void overload(int j){
//        System.out.println("오버로드3");
//    }  매개변수 타입, 갯수가 같다. 매개변수명이 다르다고 타입, 갯수가 다른 것은 아니다.  (불가)
    public void overload(int i, int j){
        System.out.println("오버로드4");
    } // 매개변수 타입은 같으나 갯수가 다르다. (가능)
    public void overload(String i){
        System.out.println("오버로드5");
    } // 매개변수 타입이 다름 (가능)

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.overload(1);
        overloading.overload(1,2);
        overloading.overload("hihi");

    }
}
