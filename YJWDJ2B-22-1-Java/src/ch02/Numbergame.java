package ch02;

import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
        int ans = (int)(Math.random() * 100) + 1;
        System.out.println(ans);
        int guess;
         Scanner sc = new Scanner(System.in);
         int tri = 0;
         do{
             System.out.println("정답을 추측하여 보시오: ");
             guess = sc.nextInt();
             tri++;

             if (guess > ans) {
                 System.out.println("제시한 정수가 높습니다.");
             }
             if (guess < ans){
                 System.out.println("제시한 정수가 낮습니다.");
             }
         } while (guess != ans);

        System.out.println("축하합니다. 시도횟수 = " + tri);
     }
}
