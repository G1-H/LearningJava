package mission.week2;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("hihi");
            return;
        }
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int START_DAY_OF_WEEK = 0 ;
        int END_DAY = 0 ;

        Calendar sDay = Calendar.getInstance();
        Calendar eDay = Calendar.getInstance();

        sDay.set(year, month - 1, 1);
        eDay.set(year, month, 1);
        eDay.add(Calendar.DATE, -1);
        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
        END_DAY = eDay.get(Calendar.DATE);

        System.out.println("       "+year+"년 " + month +"월");
        System.out.println(" SU MO TU WE TH FR SA");
        for(int i = 1 ; i <START_DAY_OF_WEEK ; i++){
            System.out.print("   ");
        }
        for(int i = 1 , n = START_DAY_OF_WEEK; i<END_DAY; i++, n++){
            System.out.print((i<10)?" 0"+i:" "+i);
            if(n%7==0) System.out.println();
        }

    }
}