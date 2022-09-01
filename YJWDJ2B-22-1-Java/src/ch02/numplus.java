package ch02;

// 정수를 입력 받아, 각 자리수의 합을 출력
// 이벤트루프 문제 => while문으로 작성

import java.util.Scanner;

public class numplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("정수 입력: ");
        int num = sc.nextInt();
        int num_length = (int)(Math.log10(num) + 1);
        int lc = 1;
        int all = 0;
        while (lc <= num_length) {
            all += (int)(num / 10^(lc - 1)) % 10;
            System.out.println(lc + " all: " + all);
            System.out.println("lc: " + lc);
            lc++;
        }
        System.out.println(all);
    }
}
