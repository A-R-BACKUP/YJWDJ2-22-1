package W01;

import java.util.Scanner;

public class W01_Q_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("받은 돈: ");
        int recive_money = sc.nextInt();
        System.out.printf("상품의 총액: ");
        int product_price = sc.nextInt();
        double tax = product_price * 0.1;
        System.out.println("부가세: " + (int)tax);
        System.out.println("잔돈: " + (recive_money - product_price));

    }
}
