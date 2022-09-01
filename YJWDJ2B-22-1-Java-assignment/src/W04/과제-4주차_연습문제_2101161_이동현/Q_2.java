package W04;

import java.util.Arrays;

public class Q_2 {
    public static void main(String[] args) {
        int value = 3, i;
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        Arrays.sort(arr);
        for (i = 0; i < arr.length; i++) {
            if (i >= 0 && i < 7) {
                System.out.print(arr[i] + ", ");
            } else if (i == 8) {
                System.out.println(arr[i]);
            }
        }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("3의 위치: " + i);
                break;
            }
        }
    }
}
