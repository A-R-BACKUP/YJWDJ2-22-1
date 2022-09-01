package W01;

import java.util.Scanner;

public class W01_Q_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("영문자 하나 입력: ");
        String eng = sc.next();
        switch (eng){
            case "A", "E", "I", "O", "U", "a", "e", "i", "o", "u" :
                System.out.println("모음입니다.");
                break;
            default:
                System.out.println("자음입니다.");
        }
    }
}
