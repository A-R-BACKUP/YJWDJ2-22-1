package W02;
/*
소인수분해 결과 출력..

 */
import java.util.Scanner;

public class W02_Q_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("자연수 입력: ");
        int num = sc.nextInt(); // 스캔 받을 숫자 받는다.
        int i = 2;
        System.out.printf("%d의 소인수 분해 = ", num);
        while (i <= num) {
            if (num % i == 0) {  // 2로 나누었을때 나머지가 0이면
                System.out.printf(i + " "); // 출력하고
                num = num / i; // num을 i로 나눠준다
            } else {
                i++; // 위의 i로 나누었을때 나머지가 0이 아니라면 i값에 1을 추가해본다.
            }
        }

    }
}
