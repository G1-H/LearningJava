package exercise.chapter_59;

import java.io.*;

public class SerializedTest {
    public static void main(String[] args) {
        Customer customer = new Customer("abc112", "hong", "barista", 30);

        byte[] serializedData = null;

        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(bos)
        ) {
            objectOutputStream.writeObject(customer);
            objectOutputStream.flush();

            serializedData = bos.toByteArray();

            System.out.println(new String(serializedData));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
             ObjectInputStream objectInputStream = new ObjectInputStream(bis)
        ) {
            Customer customer1 = (Customer) objectInputStream.readObject();

            System.out.println(customer1);
            System.out.println(customer == customer1);
            System.out.println(customer.equals(customer1));

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
