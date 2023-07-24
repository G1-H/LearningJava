package exercise.chapter_40;

public class DepartmentSituation {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);
        int price = 10_000;
        Customer customer = new VIPCustomer("Eriksen");

        Customer customer1 =new Customer("Maguire");
        Customer customer2 = new Customer("Lingard");
        Customer customer3 = new VIPCustomer("Rooney");
        Customer customer4 = new VIPCustomer("Martinez");
        Customer customer5 = new GoldCustomer("Greenwood");
        Customer customer6 = new VIPCustomer("jisung");
        Customer customer7 = new GoldCustomer("Sancho");
        Customer customer8 = new Customer("McTominay");
        Customer customer9 = new VIPCustomer("Fernandes");
        Customer customer10 = new GoldCustomer("Rashford");

        Customer[] customerQueue ={

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
