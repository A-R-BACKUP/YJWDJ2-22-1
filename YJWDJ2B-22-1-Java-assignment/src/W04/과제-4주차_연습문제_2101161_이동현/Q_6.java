package W04;

import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        int i = 0;
        String parm =  "", result = "", word = "";
        String[] hexa2bin = {
                "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("16진수 문자열을 입력하시오: ");
        parm = sc.nextLine();
        for (i = 0; i < parm.length(); i++) {
            word = (String)parm.substring(i, (i + 1));
            if (word.equals("0") ||
                word.equals("1") ||
                word.equals("2") ||
                word.equals("3") ||
                word.equals("4") ||
                word.equals("5") ||
                word.equals("6") ||
                word.equals("7") ||
                word.equals("8") ||
                word.equals("9") ||
                word.equals("a") ||
                word.equals("b") ||
                word.equals("c") ||
                word.equals("d") ||
                word.equals("e") ||
                word.equals("f") ||
                word.equals("A") ||
                word.equals("B") ||
                word.equals("C") ||
                word.equals("D") ||
                word.equals("E") ||
                word.equals("F")) {
                switch (word) {
                    case "0":
                        result += hexa2bin[0];
                        break;
                    case "1":
                        result += hexa2bin[1];
                        break;
                    case "2":
                        result += hexa2bin[2];
                        break;
                    case "3":
                        result += hexa2bin[3];
                        break;
                    case "4":
                        result += hexa2bin[4];
                        break;
                    case "5":
                        result += hexa2bin[5];
                        break;
                    case "6":
                        result += hexa2bin[6];
                        break;
                    case "7":
                        result += hexa2bin[7];
                        break;
                    case "8":
                        result += hexa2bin[8];
                        break;
                    case "9":
                        result += hexa2bin[9];
                        break;
                    case "a", "A":
                        result += hexa2bin[10];
                        break;
                    case "b", "B":
                        result += hexa2bin[11];
                        break;
                    case "c", "C":
                        result += hexa2bin[12];
                        break;
                    case "d", "D":
                        result += hexa2bin[13];
                        break;
                    case "e", "E":
                        result += hexa2bin[14];
                        break;
                    case "f", "F":
                        result += hexa2bin[15];
                        break;
                }
                result += " ";
            } else {
                System.out.println("잘못 된 입력입니다.");
                break;
            }
        }
        System.out.println("\"" + parm + "\"" + "에 대한 이진수는 " + result + "입니다.");
    }
}

// 내가 봐도 너무 또라이 같이 풀었다..
