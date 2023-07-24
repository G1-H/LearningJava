package exercise.chapter_59;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerAdvanced {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();

        //서버 소켓 생성
        //클라이언트 접속 대기
        try (ServerSocket serverSocket = new ServerSocket(1234);//서버 소켓 생성
        ) {
            System.out.println("서버가 시작되었습니다.");
            while (true) {
                try (Socket clientSocket = serverSocket.accept()//클라이언트 접속 대기
                ) {
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

                    customerList.add(customer);
                    System.out.println(customer + "가 대기 명단에 전송되었습니다.");
                    //클라이언트에게 응답을 보냄
                    printWriter.println(customerList);


                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
