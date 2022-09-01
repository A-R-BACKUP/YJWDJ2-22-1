package ch01;

/*
실습) 점수를 입력받아, 학점을 출력
조건) switch문, case최소화
Ex) 점수 입력: 90
    학점 = A
    점수 입력: 80
    학점 = B
    ....
    점수 입력: 50
    학점 = F
 */

import java.util.Scanner;

public class TestResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력: ");
        int r = sc.nextInt();
        switch (r) {
            case 90:
                System.out.println("학점 = A");
                break;
            case 80:
                System.out.println("학점 = B");
                break;
            case 70:
                System.out.println("학점 = C");
                break;
            case 60:
                System.out.println("학점 = D");
                break;
            case 50:
                System.out.println("학점 = F");
                break;

        }
    }
}
