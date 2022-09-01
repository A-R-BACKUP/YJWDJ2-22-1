package W01;

public class W01_Q_6_Test {
    public static void main(String[] args) {
        for (int num = 1; num <= 99; num++) {
            if (num >= 1 && num <= 99){
                int q1 = num / 2;
                int r1 = num % 2;
                int q2 = q1 / 2;
                int r2 = q1 % 2;
                int q3 = q2 / 2;
                int r3 = q2 % 2;
                int q4 = q3 / 2;
                int r4 = q3 % 2;
                int q5 = q4 / 2;
                int r5 = q4 % 2;
                int q6 = q5 / 2;
                int r6 = q5 % 2;
                int r7 = q6 % 2;
                if (r7 == 1){
                    System.out.println(num + ": " + r7 + r6 + "" + r5 + "" + r4 + "" + r3 + "" + r2 + "" + r1);
                }
                if (r7 == 0 && r6 == 1) {
                    System.out.println(num + ": " + r6 + r5 + "" + r4 + "" + r3 + "" + r2 + "" + r1);
                }
                if (r7 == 0 && r6 == 0 && r5 == 1) {
                    System.out.println(num + ": " + r5 + r4 + "" + r3 + "" + r2 + "" + r1);
                }
                if (r7 == 0 && r6 == 0 && r5 == 0 && r4 == 1) {
                    System.out.println(num + ": " + r4 + r3 + "" + r2 + "" + r1);
                }
                if (r7 == 0 && r6 == 0 && r5 == 0 && r4 == 0 && r3 == 1) {
                    System.out.println(num + ": " + r3 + r2 + "" + r1);
                }
                if (r7 == 0 && r6 == 0 && r5 == 0 && r4 == 0 && r3 == 0 && r2 == 1) {
                    System.out.println(num + ": " + r2 + r1);
                }
                if (r7 == 0 && r6 == 0 && r5 == 0 && r4 == 0 && r3 == 0 && r2 == 0 && r1 == 1) {
                    System.out.println(num + ": " + r1);
                }
            }
        }
    }
}
