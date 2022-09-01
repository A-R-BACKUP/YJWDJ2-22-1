package ch01;

/*
실습) 2차 방정식의 계수를 입력받아, 방정식의 근을 출력
    ax^2 + bx + c = 0
    Ex) 2차 방정식 계수 입력: 1 -2 1
        중근 = 1.0
    Ex) 2차 방정식 계수 입략: 1 -2 -3
        두 실근 = -1.0, 3.0
    Ex) 2차 방정식 계수 입력: 1 -2 2
        근이 없음
 */

import java.util.Scanner;

public class quadratic_equation {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.printf("2차 방정식 계수 입력: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int check = (b * b) - (4 * a * c);
        if (check < 0) {
            System.out.println("근이 없음");
        } else if (check == 0) {
            System.out.println("중근 = " + -b / (2.0 * a));
        } else if (check > 0) {
            System.out.printf("두 실근 = %.1f, %.1f\n", (-b + Math.sqrt(check)) / (2.0 * a), (-b - Math.sqrt(check)) / (2.0 * a));
        }
    }
}
