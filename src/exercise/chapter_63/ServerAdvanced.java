package exercise.chapter_63;

import exercise.chapter_59.Customer;

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
                try {
                    Socket clientSocket = serverSocket.accept();//클라이언트 접속 대기
                    Thread request = new Thread(new RequestHandler(clientSocket,customerList));
                    request.start();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
