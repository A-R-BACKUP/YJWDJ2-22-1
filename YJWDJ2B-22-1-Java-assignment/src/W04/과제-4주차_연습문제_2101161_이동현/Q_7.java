package W04;

/*
2의 100 제곱 값을 출력하는 프로그램 작성
조건) 정수 배열 이용

long의 범위를 이미 훨씬 뛰어 넘기에 생각이 많이 필요할 듯
 */

import java.math.BigInteger;
import java.util.Arrays;

public class Q_7 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("2");
        BigInteger b = a.pow(100);      // long의 범위를 넘어가는 숫자이기에 BigInteger 사용
        String c = b.toString();        // String으로 변경

        char[] arr = new char[c.length()];      // 배열 생성

        for (int i = 0; i < c.length(); i++) {      // 배열에 숫자 하나씩 집어 넣는 반복문 생성
            arr[i] = c.charAt(i);
        }

        System.out.println(Arrays.toString(arr));       // 배열 출력.

    }
}
