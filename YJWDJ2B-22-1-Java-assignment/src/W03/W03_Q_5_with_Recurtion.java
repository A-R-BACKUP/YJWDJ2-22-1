package W03;

import java.util.Arrays;
import java.util.Scanner;

public class W03_Q_5_with_Recurtion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String name = sc.nextLine().toLowerCase();
        char[] chars = name.toCharArray();
        boolean isPalindrome = isPalindrome(chars);
        System.out.println(isPalindrome);
    }



    public static boolean isPalindrome(char[] name) {
        if (name.length <= 1) {
            return true;
        }

        if (name[0] == name[name.length-1]) {
            return isPalindrome(Arrays.copyOfRange(name, 1, name.length-1));
        } else {
            return false;
        }
    }
}
