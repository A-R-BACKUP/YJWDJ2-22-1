package W04;

import java.util.Scanner;

public class W04_Q_5 {
    public static void main(String[] args) {
        int i = 0, sum = 0, grd = 0;
        double avg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 수를 입력하시오.: ");
        int[] arr = new int[sc.nextInt()];
        for (i = 0; i < arr.length; i++) {
            Scanner gr = new Scanner(System.in);
            System.out.print("학생 " + (i + 1) + "의 성적을 입력하시오: ");
            grd = gr.nextInt();
            if (grd >= 0 && grd <= 100) {
                arr[i] = grd;
            } else {
                System.out.println("잘못된 성적입니다. 다시 입력하시오.");
                i--;
            }
        }
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = (double)(sum / arr.length);
        System.out.println("성적 평균은 " + avg + "입니다.");
    }
}