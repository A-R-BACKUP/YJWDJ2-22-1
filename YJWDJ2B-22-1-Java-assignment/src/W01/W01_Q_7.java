package W01;

import java.util.Scanner;

public class W01_Q_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("정수를 입력하시오: ");
        int a = sc.nextInt();
        System.out.printf("정수를 입력하시오: ");
        int b = sc.nextInt();
        System.out.printf("정수를 입력하시오: ");
        int c = sc.nextInt();
        int d = 0;
        if (b > c) {
            d = c;
            c = b;
            b = d;
            d = 0;
        }
        if (a > b) {
            d = a;
            a = b;
            b = d;
            d = 0;
        }
        if (b > c) {
            d = c;
            c = b;
            b = d;
            d = 0;
        }
        System.out.println("정렬된 숫자: " + a + " " + b + " " + c);

    }
}
