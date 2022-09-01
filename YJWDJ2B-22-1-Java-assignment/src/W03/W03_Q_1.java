package W03;

/*
i를 900부터 1000까지 설정함
n을 만들어주었고
 */

public class W03_Q_1 {
    public static void main(String[] args) {
        int count = 1;
        int max_count = 0;
        int temp = 0;
        for (int i = 900; i <= 1000; i++) {
            int n = i;

            // 짝수일때
            if (n % 2 == 0) {
                while (n != 1) {
                    if (n % 2 == 0){
                        n = (n / 2);
                        count++;
                        // System.out.println(i + "'s " + count);
                    }
                    else if (n % 2 != 0) {
                        n = (n * 3) + 1;
                        count++;
                    }
                }
            }

            // 홀수일때
            else if (n % 2 != 0) {
                while (n != 1) {
                    if (n % 2 == 0){
                        n = (n / 2);
                        count++;
                    }
                    else if (n % 2 != 0) {
                        n = (n * 3) + 1;
                        count++;
                    }
                }
            }

            if (count > max_count) {
                max_count = count;
            }
            count = 1;
        }

        System.out.println(max_count);
    }
}
