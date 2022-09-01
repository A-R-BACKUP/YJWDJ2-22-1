package W03;

/*
문자열을 입력받아, 회문인지를 체크하는 프로그램 작성.
조건!! 재귀호출함수 사용

Ex) 문자열 입력: Tenet
    회문 여부: True



 */

import java.util.Scanner;

public class W03_Q_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: "); // 문자열 입력 받기
        System.out.println(check(sc.nextLine().toLowerCase()));
    }

    public static boolean check(String input) {
        return input.equals(new StringBuilder(input).reverse().toString());
    }
}
