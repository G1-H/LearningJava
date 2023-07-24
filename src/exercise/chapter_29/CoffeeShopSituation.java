package exercise.chapter_29;

public class CoffeeShopSituation {
    public static void main(String[] args) {
        //인스턴스화
        Customer customer = new Customer();
        customer.setCashAmount(50_000);

        Cashier cashier = new Cashier();
        cashier.setSalesAmount(1_000_000);

        Barista barista = new Barista();

        //로직
        String coffeeName = "아메리카노";
        boolean isTakeOut = true;
        customer.askCoffee(cashier, coffeeName);

        long price = cashier.checkCoffeePrice(coffeeName);
        cashier.replyCoffeePrice(coffeeName, price);

        long cash = customer.withdrawCash(price);
        customer.orderCoffee(coffeeName, isTakeOut);

        cashier.addSalesAmount(cash);
        cashier.sayOrder(coffeeName);

        barista.noticeOrder(coffeeName);
        Coffee coffee = barista.makeUpCoffe(coffeeName, 500, 30);
        barista.sayCoffeeReady(coffee);

        Coffee coffeeComplete = cashier.wrapUpCoffee(coffee);
        cashier.sayCoffeeReady(coffeeComplete);

        customer.drinkCoffee(coffeeComplete);
        if (coffeeComplete.getCoffeeName() == coffeeName && coffeeComplete.isWrappedUp() == isTakeOut)
            customer.upgradeMyFeeling();
        else customer.setMyFeeling("기분이 얹짢네요.");
        customer.showMyFeeling();
    }
}
