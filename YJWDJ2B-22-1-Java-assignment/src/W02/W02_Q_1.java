package W02;

/*
답은 343400 이라는데... 모두들 171700 나온다고 하십니다... 답은 171700 인걸로...
 */

public class W02_Q_1 {
    public static void main(String[] args) {
        int sum = 0;
        int total = 0;
        for (int num = 1; num <= 100; num++){
            sum += num;
            // System.out.println(sum + "  sum <-> num  " + num); // 체크용
            total += sum;
            // System.out.println(num + "'s total: " + total); // 체크용
            // System.out.println(); // 체크용
        }
        System.out.println("합은: " + total);
    }
}
