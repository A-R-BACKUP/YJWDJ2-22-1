package W02;

/*
(4/1)-(4/3)+(4/5)-(4/7)+(4/9)-(4/11)+(4/13)-(4/15)+(4/17)...
뺄셈 한번하고 덧셈도 한번하는 것을 반복..
분모는 +2 씩 더해지고 있다...

((4/1) - (4/3)) + ((4/5) - (4/7)) = 2.8952380952

- 하는 부분을 묶고 덧셈하는 것을 반복한다.
 */

public class W02_Q_7 {
    public static void main(String[] args) {
        double nume = 4; // 분자값
        double deno = 1; // 분모값
        double total = 0;
        int count = 1;
        while (count < 5001) { // 묶음 5000개를 더한다.
            total += ((nume / deno) - (nume / (deno + 2)));
            // System.out.println(count + "count: " +  total);
            deno = deno + 4;
            count++;
        }
        System.out.println(total);
    }
}
