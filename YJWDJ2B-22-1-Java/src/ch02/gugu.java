package ch02;

// 구구단 출력;;

public class gugu {
    public static void main(String[] args) {
        int f = 2;
        int b = 1;
        for (int i = 1; i <= 9; i++){
            for (int j = 2; j <= 9; j++){
                int result = (f * b);
                if ((int)(Math.log10(result) + 1) == 2) {
                    System.out.print(f + " * " + b + " = " + (result)+ "  ");
                } else {
                    System.out.print(f + " * " + b + " = " + (result) + "   ");
                }
                f++;
            }
            if (f >= 2){
                f = 2;
            }
            System.out.println();
            b++;
        }
    }
}
