package ch03;

import java.util.Scanner;

public class Training3 {
    public static void main(String[] args) {
        System.out.println(sum(6, 10));
    }
    static int sum(int a, int b) {
        if (a == b)
            return a;

        return sum (a+1, b) + a;
    }
}
