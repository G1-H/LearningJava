package mission;

public class ChuncheonTicket3 {
    public static void main(String[] args){
        final int SENIOR_AGE_STANDARD = 65;
        final String KOREA_STANDARD = "Korea";
        int aliceAge = 70;
        String aliceCountry = "America";

        int kimAge = 65;
        String kimCountry = "Korea";

        int yooAge = 42;
        String yooCountry ="Korea";

        boolean aliceDiscountOrNot = (aliceAge >=SENIOR_AGE_STANDARD && aliceCountry==KOREA_STANDARD);
        boolean kimDiscountOrNot = (kimAge >=SENIOR_AGE_STANDARD && kimCountry==KOREA_STANDARD);
        boolean yooDiscountOrNot = (yooAge >=SENIOR_AGE_STANDARD && yooCountry==KOREA_STANDARD);

        System.out.printf("Alice는 적용 대상자인가?%10B%n", aliceDiscountOrNot);
        System.out.printf("Kim은 적용 대상자인가?%10B%n",kimDiscountOrNot);
        System.out.printf("Yoo는 적용 대상자인가?%10B%n",yooDiscountOrNot);
        System.out.println();
    }
}
