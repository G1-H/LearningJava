package exercise.chapter_39;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("나철수");
        VIPCustomer vipCustomer = new VIPCustomer("나관종");
        Customer customer1 = new Customer("나영희");

        customer.printMyInfo();
        customer1.printMyInfo();
        vipCustomer.printMyInfo();

    }
}
