package exercise.chapter_62;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C001", "이순신"));
        customers.add(new Customer("C002", "아이유"));
        customers.add(new Customer("C003", "카리나"));
        customers.add(new Customer("C004", "윈터"));

        // 람다식 사용
        // StringUtils 의 isLongName static 메소드를 이용하여 긴 이름의 손님들 이름을 출력
//
//        customers.stream()
//                .map(customer -> customer.name)
//                .filter(name -> StringUtils.isLongName(name))
//                .forEach(name -> System.out.println(name));
        customers.stream()
                .map(customer -> customer.name)
                .filter(StringUtils::isLongName)
                .forEach(System.out::println);

        List<String> customerNames = Arrays.asList(
                "이순신",
                "민지",
                "오해원",
                "아이유"
        );

        // 람다식 사용
        // 손님들 이름을 가지고 새로운 Customer List 로 만들어라.
//        List<Customer> customerList = customerNames.stream()
//                .map(name -> new Customer(name))
//                .collect(Collectors.toList());
        List<Customer> customerList = customerNames.stream()
                .map(Customer::new)
                .collect(Collectors.toList());

        System.out.println("customerList : " + customerList);
    }
}
