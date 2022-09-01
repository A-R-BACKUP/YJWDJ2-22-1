package W03;

/*
101의 제네레이터
91, 100

9 + 1 + 91 = 101
1 + 0 + 0 + 100 = 101

이런식인데...
 */

import java.util.*;

public class W03_Q_2_With_explation {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        int total = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        // 1 ~ 5000 까지 수 채우기
        for (int i = 0; i < 5000; i++) {
            numbers.add(i + 1);
        }

        for (int i = 0; i < 5000; i++) {
            sum = 0; // 연산 해서 나온 수(제네레이터)
            n = i + 1; // n : 지금 계산 하는 수
            String nToStr = String.valueOf(n); // n 을 문자열로 변환
            int numlength = nToStr.length(); // n의 문자열 길이 구하기
            // 123 = 1 / 2 / 3
            // 1 / 2 / 3 = 6 . for 끝나고 6 + 자기자신(123) = 129

            // 숫자 분리 하기
            for (int j = 0; j < numlength; j++) {
                String oneNum = nToStr.substring(j, j + 1);

                sum += Integer.parseInt(oneNum);
                if (j == numlength - 1) {
                    // 마지막 반복일때
                    sum += n; // sum = sum + n(원래 숫자)
                }
            }
            // not Self-numbers 일때
            if (numbers.indexOf(sum) != -1) { // 어레이에 sum이 있으면
                numbers.remove(Integer.valueOf(sum)); // 어레이에 129가 있으면 제거
            }
            // 123 끝남
            // 124 해야지
        }
        // numbers 어레이에 Self-Numbers가 아닌 애들이 다지워진 상황

        //System.out.println("Self-Numbers 들 : ");
        for (int i = 0; i < numbers.size(); i++) {
            //System.out.printf("%6s", numbers.get(i) + " ");
            total += numbers.get(i);
        }
        //System.out.println();
        System.out.println("총합: " + total);
    }
}
