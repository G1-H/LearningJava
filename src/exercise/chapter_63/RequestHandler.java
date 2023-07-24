package exercise.chapter_63;

import exercise.chapter_59.Customer;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class RequestHandler implements Runnable{

    private Socket clientSocket;
    private List<Customer> customerList;

    public RequestHandler(Socket clientSocket, List<Customer> customerList) {
        this.clientSocket = clientSocket;
        this.customerList = customerList;
    }

    @Override
    public void run() {
        try {
            System.out.println("클라이언트가 접속하였습니다.");
            //클라이언트로부터 데이터를 받기 위한 InputStream 생성
            InputStream clientInputStream = clientSocket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(clientInputStream);

            //클라이언트로 데이터를 보내기 위한 OutputStream 생성
            OutputStream serverOutputStream = clientSocket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

            //inputLine;
            String inputLine;
            //클라이언트로부터 데이터를 읽고 화면에 출력

            Customer customer = (Customer) objectInputStream.readObject();

            ListUtils.addList(customerList, customer);
            System.out.println("Thread : " + Thread.currentThread().getName() + " " + customer + "가 대기 명단에 전송되었습니다.");
            //클라이언트에게 응답을 보냄
            printWriter.println(customerList);
            clientSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
