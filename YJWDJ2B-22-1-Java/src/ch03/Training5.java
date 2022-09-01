package ch03;

/*
실습) 영문장을 입력 받아 대문자, 소문자, 빈칸 개수 출력
 */

import java.util.Scanner;

public class Training5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;

        System.out.printf("영문장 입력: ");
        str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                cnt1++;
            }
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cnt2++;
            }
            if (str.charAt(i) >= ' ') {
                cnt3++;
            }
        }

        System.out.println("대문자 = " + cnt1);
        System.out.println("소문자 = " + cnt2);
        System.out.println("빈칸 = " + cnt3);

    }
}
