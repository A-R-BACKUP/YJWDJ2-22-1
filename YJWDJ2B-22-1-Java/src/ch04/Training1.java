package ch04;

/*
실습) 1~10의 임의의 정수를 가지는 크기 10 정수 배열 생성
     사용자로 부터 타겟 정수 입력 받아, 처음 위치 출력

     예) 찾을 정수 입력: 9
     위치: -1

     예) 찾을 정수 입력: 9
     위치: -1
 */

import java.util.Arrays;
import java.util.Scanner;

public class Training1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rda = new int[10];
        int target, i, index;

        for (i = 0; i < rda.length; i++) {
            rda[i] = (int)(Math.random() * 10);
            // 1과 10사이의 난수를 발생시키는 방법

        }

//        for (int i = 0; i < rda.length; i++) {
//            System.out.print(rda[i] + " ");
//
//        }
//        위의 테스트 코드를 아래의 코드로 한방에 줄일 수 있다.
//        System.out.println(Arrays.toString(rda));

        System.out.print("찾을 수 입력: ");
        target = sc.nextInt();

        index = search (rda, target);
        
        if (index >= 0) {
            System.out.println("찾은 위치 = " + index);
        } else {
            System.out.println("없음");
        }
    }

    static int search(int[] rda, int target) {
        int i;

        for (i = 0; i < rda.length; i++) {
            if (rda[i] == target)
            return i;
        }

        return -1;
    }
}
