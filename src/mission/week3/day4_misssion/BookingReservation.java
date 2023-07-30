package mission.week3.day4_misssion;

import java.util.Scanner;

/**
 * <TODO>
 *     유저의 userID와 목적지를 하나를 받습니다.
 *      목적지로 가는 '왕복' 또는 '편도' 항공권 중 가장 출발이 빠른 항공권으로 예약을 진행 합니다.
 *      만약 가는 목적지로 가는 항공권'이 없다고 하고 예약을 진행하지 않습니다.
 *      만약 userId에 해당하는 Passenger ID가 없다면 RuntimeException를 뱉어야 합니다.
 */

public class BookingReservation {
    // MySQL 데이터베이스 연결 정보
    private static final String DB_URL = "jdbc:mysql://localhost:3306/week5_mission";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12341234";

    public static void main(String[] args) throws ClassNotFoundException {

        // TODO: 가고싶은 목직지로 가는 항공권 중 가장 빠른 것 하나를 찾는 쿼리
        String sqlQuery ="SELECT * FROM airline_ticket " +
                " WHERE departure_loc = ? " +
                " ORDER BY departure_at LIMIT 1;";

        // TODO: userId로 PassengerId 가져오는 쿼리
        String sqlQuery2;

        // TODO: 예약하는 SQL 구문
        String sqlInsert;

        Scanner scanner = new Scanner(System.in);
        System.out.println("예약할 userId 입력해주세요~ ");
        Integer userId = Integer.valueOf(scanner.nextLine());
        System.out.println("가고 싶은 항공권 목적지를 입력해주세요~");
        String destination = scanner.nextLine();

        // TODO: Connection 연결 및 Statement 정의
        try {

            // TODO: 가고싶은 목직지로 가는 항공권 중 가장 빠른 airline의 ticketId 가져오기

            // TODO: userId에 해당하는 passengerId 가져오기

            // TODO: passengerId, ticketId로 예약하기 ( 처음 상태는 대기 )


        } catch (Exception e){

        }
    }
}