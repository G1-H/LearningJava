package exercise.chapter_62;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {
    public static void main(String[] args) {
        //Static method
        Consumer<String> ex1 = (str) -> Printer.printSomething(str);
        Consumer<String> ex2 = Printer::printSomething;

        ex1.accept("Lamda식 사용");
        ex2.accept("Method 레퍼런스 사용");

        //생성자 호출
        Supplier<Customer> ex3 = () -> new Customer();
        Supplier<Customer> ex4 = Customer::new;

        System.out.println(ex3.get());
        System.out.println(ex4.get());

        Function<String, Customer> ex5 = (str) -> new Customer(str);
        Function<String, Customer> ex6 = Customer::new;

        System.out.println("name 들어간 생성지: " + ex5.apply("이순신"));
        System.out.println("name 들어간 생성지: " + ex6.apply("아이유"));

    }
}
