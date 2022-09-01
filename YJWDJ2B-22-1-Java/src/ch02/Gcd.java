package ch02;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        int x, y, r;
        System.out.println("두개의 정수를 입력하시오(큰수, 작은수): ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        while (y != 0) {
            r = x % y;
            x = y;
            y = r;
        }
        System.out.println("최대 공략수는 " + x);
    }
}
