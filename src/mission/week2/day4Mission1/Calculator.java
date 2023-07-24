package mission.week2.day4Mission1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        char operator;


        num1 = 10;
        num2 = 2;
        operator = '&';
        try {
            double result = calculate(num1, num2, operator);
            System.out.println("계산 결과 : " + result);
        } catch (DivideByZeroException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (InvalidOperatorException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예상치 못한 오류 발생");
        }

    }

    public static Integer calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return (num1 - num2);

            case '*':
                return (num1 * num2);

            case '/':
                if (num2 == 0) throw new DivideByZeroException("num2는 0일 수 없습니다.");
                return (num1 / num2);
            default:
                throw new InvalidOperatorException("유효하지 않은 연산자 '"+operator+"'가 입력되었습니다.");
        }
    }
}
