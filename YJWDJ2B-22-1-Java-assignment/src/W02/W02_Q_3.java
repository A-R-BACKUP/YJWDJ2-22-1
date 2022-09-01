package W02;

public class W02_Q_3 {
    public static void main(String[] args) {
        long a = 0, b = 1, c;

        System.out.print(b + " ");

        for(int i = 2; i <= 10; i++){
            c = a + b;
            System.out.print(c + " "); // 각 항 출력하게 하기.
            a = b;
            b = c;
        }
    }
}
