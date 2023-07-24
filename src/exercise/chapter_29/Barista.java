package exercise.chapter_29;

public class Barista {
    public void noticeOrder(String coffeeName) {
        System.out.printf("바리스타 : 커피(%s) 주문 확인했습니다.\n", coffeeName);
    }

    public Coffee makeUpCoffe(String coffeeName, long waterQuantity, long coffeeBeanQuantity) {
        Coffee coffee = new Coffee(coffeeName, waterQuantity, coffeeBeanQuantity);
        return coffee;
    }

    public void sayCoffeeReady(Coffee coffee) {
        String coffeeName = coffee.getCoffeeName();
        System.out.printf("바리스타 : %s 커피가 다 만들어졌습니다.\n", coffeeName);
    }
}
