package exercise.chapter_44;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Customer customer = new Customer("lay");
        Class clazz = customer.getClass();
//        Class class = Customer.class;

        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }


        Field[] fields = clazz.getDeclaredFields();;
        for (Field field : fields) {
            System.out.println(field);
        }

        Customer customer2 = (Customer) clazz.getConstructor(String.class,String.class).newInstance("ID1","민철");
        System.out.println(customer2);
    }
}
