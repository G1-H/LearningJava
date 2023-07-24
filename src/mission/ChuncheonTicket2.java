package mission;

public class ChuncheonTicket2 {
    public static void main(String[] args){
        int ticketMuseum = 1111;
        int howManyPeopleToGet = ticketMuseum/4;
        int howManyTicketLeft = ticketMuseum%4;

        System.out.printf("티켓을 가져 갈 수 있는 근무자 수는?%10d명%n",howManyPeopleToGet);
        System.out.printf("티켓을 다 나눠주고 남은 티켓 수는?%10d장",howManyTicketLeft);
    }
}
