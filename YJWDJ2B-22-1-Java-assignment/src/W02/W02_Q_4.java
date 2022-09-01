package W02;

import java.util.Scanner;

public class W02_Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n을 입력하시오: "); // n 입력 받기
        int count = sc.nextInt();
        double sum = 0;
        for (double i = 2; i <= count; i++){
            sum += (1 / i);
        }
        double last = sum + 1;
        System.out.print(last);
    }
}
