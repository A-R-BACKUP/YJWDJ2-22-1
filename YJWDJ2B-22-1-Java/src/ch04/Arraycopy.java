package ch04;

import java.util.Arrays;

public class Arraycopy {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i, sum = 0;
        double avg, dsum = 0;
        int[] arr2;

        for (i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }

        System.out.println(Arrays.toString(arr));

        arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.equals(arr, arr2));
    }
}
