package exercise.chapter_39;

public class DepartmentSituation {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);
        int price = 10_000;
        Customer customer = new VIPCustomer("Eriksen");

        Customer[] customerQueue ={
                new Customer("Maguire"),new Customer("Lingard"),new VIPCustomer("Rooney"),customer,
                new VIPCustomer("Martinez"),customer, new GoldCustomer("Greenwood"),new VIPCustomer("jisung"),
                new GoldCustomer("Sancho"), new Customer("McTominay"), new VIPCustomer("Fernandes"),customer,
                new GoldCustomer("Rashford")
        };

        for(Customer customerEach: customerQueue){
            int cash = staff.helpPayment(customerEach, price);
            System.out.printf("내가 내는 금액은 : %d\n",cash);
            staff.addSaleAmount(cash);
            customerEach.printMyInfo();

        }
        staff.printMySalesAmount();


    }
}
