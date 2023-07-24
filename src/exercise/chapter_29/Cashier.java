package exercise.chapter_29;

public class Cashier {
    //속성
    private long salesAmount;

    //행위
    public long checkCoffeePrice(String coffeeName) {
        long price;
        switch (coffeeName) {
            case "아메리카노":
                price = 5000;
                break;
            case "카페라떼":
                price = 6000;
                break;
            case "카페모카":
                price = 6500;
                break;
            case "카푸치노":
                price = 6000;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }

    public void replyCoffeePrice(String coffeeName, long price) {
        if (price == 0) {
            System.out.printf("캐시어 : 죄송합니다 손님, %s는 저희 매장이 메뉴로 준비되어 있지 않습니다.\n", coffeeName);
        } else {
            System.out.printf("캐시어 : 주문 주신 %s는 %d 원입니다.\n", coffeeName, price);
        }
    }

    public void addSalesAmount(long money) {
        this.salesAmount += money;
    }

    public void sayOrder(String coffeeName) {
        System.out.printf("캐시어 : %s 주문이 들어왔습니다.\n", coffeeName);
    }

    public Coffee wrapUpCoffee(Coffee coffee) {
        coffee.beWrappedUp();
        return coffee;
    }

    public void sayCoffeeReady(Coffee coffee) {
        String coffeeName = coffee.getCoffeeName();
        System.out.printf("캐시어 : %s 나오셨습니다.\n", coffeeName);
    }

    public void setSalesAmount(long salesAmount) {
        this.salesAmount = salesAmount;
    }
}
