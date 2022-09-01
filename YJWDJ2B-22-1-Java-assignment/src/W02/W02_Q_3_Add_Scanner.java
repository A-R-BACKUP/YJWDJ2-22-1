package W02;

import java.util.Scanner;

public class W02_Q_3_Add_Scanner {
    public static void main(String[] args) {
        long a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 번쨰 항까지 출력?: ");
        int term = sc.nextInt();
        if (term > 0 && term <= 2) {
            System.out.print( b + " ");
        } else if (term > 0 && term >= 2) {
            System.out.print(b + " ");
            for(int i = 2; i <= term; i++){
                c = a + b;
                System.out.print(c + " "); // 각 항 출력하게 하기.
                a = b;
                b = c;
            }
        } else {
            System.out.println("error");
        }
    }
}
