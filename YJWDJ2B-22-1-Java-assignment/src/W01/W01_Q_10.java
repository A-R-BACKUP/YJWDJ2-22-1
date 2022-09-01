package W01;

import java.util.Scanner;

public class W01_Q_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("실수 입력: ");
        double a = sc.nextDouble();
        System.out.println(String.format("%.0f", a));
    }
}
