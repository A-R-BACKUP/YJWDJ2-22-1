package ch01;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;

        System.out.print("년도 입력 : ");
        y = sc.nextInt();

        if (y % 4 == 0 && y % 100 !=0 || y % 400 == 0) {
            System.out.println("날짜수 = 366");
        } else {
            System.out.println("날짜수 = 365");
        }
    }
}
