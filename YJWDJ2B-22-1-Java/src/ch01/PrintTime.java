package ch01;

/*
실습) 시스템에서 오늘 날짜와 현재시각 읽어와 아래와 같이 출력
년/월/일 시:분:초
 */

import java.util.*;

public class PrintTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("%d/%02d/%02d %02d:%02d:%02d\n", date.getYear() + 1900, date.getMonth() + 1, date.getDate(), date.getHours(), date.getMinutes(), date.getSeconds());
    }
}
