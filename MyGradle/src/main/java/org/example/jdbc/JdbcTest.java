package org.example.jdbc;

import java.sql.*;

public class JdbcTest {
    //RDB, MySQL 접근 정보
    private static final String DB_URL = "jdbc:mysql://localhost:3306/chapter_78";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12341234";

    public static void main(String[] args) {
        //Connection 만들기. Connection 이후에 close
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement statement = connection.createStatement()
        ) {
            //1000원 이상 사용한 group_singer 가져오기
            String stringSQL = "SELECT * " +
                    "FROM group_singer G" +
                    "   JOIN buy_history B" +
                    "   ON G.mem_id = B.mem_id" +
                    "   WHERE price > 1000;";


            ResultSet resultSet = statement.executeQuery(stringSQL);
            while (resultSet.next()) {
                String memId = resultSet.getString("mem_id");
                String memName = resultSet.getString("mem_name");
                Long price = resultSet.getLong("price");

                System.out.println("mem_id : " + memId+" mem_name : " + memName+" price : " + price);
            }

            //Group_singer 에 새로운 singer "르세라핌"을 넣어 INSERT 문을 JDBC 로 실행
            String stringSQL2 = "INSERT INTO group_singer(mem_id, mem_name, mem_number, addr, phone, height, debut_date) " +
                    "VALUES ('M1212', '르세라핌', 5, '서울', 01012341234, 170, '2020-12-06');";

            statement.executeUpdate(stringSQL2);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
