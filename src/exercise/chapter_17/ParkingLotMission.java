package exercise.chapter_17;

public class ParkingLotMission {
    public static void main(String[] args){
        int useMoney = 30_000;
        int parkingTime = 6;

        if(useMoney >= 200_000){
            parkingTime -= 5;
        }else if(useMoney >= 100_000){
            parkingTime -= 4;
        }else if(useMoney >= 50_000){
            parkingTime -= 3;
        }else if(useMoney >= 30_000){
            parkingTime -= 2;
        }else if(useMoney >= 10_000){
            parkingTime -= 1;
        }

        System.out.printf("고객님은 %d원을 사용했기 때문애에, %d 시간 결제하셔야 합니다.",useMoney,parkingTime);
    }
}
