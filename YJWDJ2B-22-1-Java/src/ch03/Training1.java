package ch03;

/*
실습) 두 정수를 입력 받아, 최대공약수와 최소공배수 출력
A * B = GCD * LCM
함수형식: static in gcd(int x, int y)

예) 두 정수 입력: 36 24
    최대공약수 = 12
    최소공배수 = 36 * 24 / 12 = 72
 */

import java.util.Scanner;

public class Training1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int x = sc.nextInt();
        System.out.print("정수 입력: ");
        int y = sc.nextInt();
    }
}