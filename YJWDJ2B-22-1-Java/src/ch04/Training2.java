package ch04;

import java.util.Arrays;
import java.util.Scanner;

/*
실습) 5개의 정수를 입력 받아 배열에 저장한 후, 최대값과 평균, 분산, 표준편자를 각각 출력하시오
    실행 예)
    정수 입력: 1 2 5 4 3
    최대 값: 5
    평균: 3.0
    분산: (4 + 1 + 4 + 1 + 0) / 5.0 = 2.0
    ... (치기도 어려운 숫자기호 남발하심...)
 */
public class Training2 {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);

        int s[] = new int[10];
        int i ,sum =0;
        double avg, dsum =0;


        for(i = 0; i<10; i++)
            s[i] = (int)(Math.random()*10)+1;
        // System.out.print(s[i]+" "); --> 대체하는 코드 Arrays.toString(s) ** 자주 쓸듯.

        System.out.println(Arrays.toString(s));

        for(i=0; i<s.length;i++)
            sum += s[i];
        // 평균값
        avg = (double)sum / s.length;
        System.out.println(avg);

        // 분산값

        for(i=0; i<s.length;i++)
            dsum += (s[i] - avg) * (s[i] -avg);

        System.out.printf("분산 = %.1f\n",dsum/s.length);
        System.out.printf("분산 = %.1f\n",Math.sqrt(dsum/s.length));

    }
}
