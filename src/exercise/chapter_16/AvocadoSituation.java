package exercise.chapter_16;

import java.util.Arrays;

public class AvocadoSituation {
    public static void main(String[] args) {
        //장보기 전
        int milks = 0;
        int avocados = 0;
        boolean existedAvocado = true;

        //장보기
//        if(existedAvocado){
//            milks += 6;
//        }else{
//            milks +=1;
//        }
        milks = existedAvocado ? 6 : 1;

        //집으로 돌아오기

        System.out.printf("아내야, 장보고 돌아왔어 %d개 아보카도, %d개 우유 사왔어.", avocados, milks);
    }
}
