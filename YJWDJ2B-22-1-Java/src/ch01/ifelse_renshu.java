package ch01;

/*
실습) 숫자를 입력 받아 크기를 출력하기
10 미만 small
10 이상 20 미만 medium
20 이상 large
 */

import java.util.Scanner;

public class ifelse_renshu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요: ");
        int a = sc.nextInt();
        if (a <= 9){
            System.out.println("small");
        } else if (a >= 10 && a <= 19){
            System.out.println("medium");
        } else if (a >= 20) {
            System.out.println("large");
        }
    }
}
