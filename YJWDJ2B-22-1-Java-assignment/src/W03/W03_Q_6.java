package W03;

import java.util.Scanner;

public class W03_Q_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        String numS = scanner.nextLine();

        int com = (numS.length()-1)/3;
        int nonCom = (numS.length())%3;

        StringBuffer numB = new StringBuffer(numS);
        numB = numB.reverse();

        StringBuffer numC = new StringBuffer();
        int index =0;
        for(int i=0;i<com;i++) {
            numC = numC.append(numB.charAt(index++)).append(numB.charAt(index++)).append(numB.charAt(index++)).append(',');
        }
        for(int i=0;i<nonCom;i++) {
            numC = numC.append(numB.charAt(index++));
        }
        numC = numC.reverse();

        System.out.print("금액 출력: " + numC);
    }
}
