package ch01;

/*
실습) 빛이 1년동안 가는거리(KM) 출력
힌트) 빛의 속도 = 초당 300,000km
 */

import java.util.Scanner;

public class light_speed {
    public static void main(String[] args) {
        long speed = 300000;
        int sec = 31536000;
        long distance = speed * sec;


        System.out.println("빛이 1년 동안 가는거리 " + distance + "km");
    }
}
