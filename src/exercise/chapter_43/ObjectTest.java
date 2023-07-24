package exercise.chapter_43;




public class ObjectTest {
    public static void main(String[] args) {
        Customer customer = new Customer("민철");
        GoldCustomer customer1 = new GoldCustomer("채윤");
        VIPCustomer customer2 = new VIPCustomer("세진");
        Staff staff = new Staff();


        System.out.println(customer.toString());
        System.out.println(customer1.toString());
        System.out.println(staff);
        System.out.println(customer2);
    }
}
