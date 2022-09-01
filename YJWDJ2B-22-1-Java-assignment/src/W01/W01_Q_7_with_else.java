package W01;

import java.util.Scanner;

public class W01_Q_7_with_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("세 정수 입력: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b)
            if (a > c)
                if (b > c)
                    System.out.printf("%d>%d>%d", a, b, c);
                else
                    System.out.printf("%d>%d>%d", a, c, b);
            else
                System.out.printf("%d>%d>%d", c, a, b);
        else
            if (b > c)
                if (a > c)
                    System.out.printf("%d>%d>%d", b, a, c);
                else
                    System.out.printf("%d>%d>%d", b, c, a);
            else
                System.out.printf("%d>%d>%d", c, b, a);

    }
}
