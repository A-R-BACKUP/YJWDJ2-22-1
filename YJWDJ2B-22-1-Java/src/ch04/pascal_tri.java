package ch04;

// 파스칼의 삼각형 참조...

public class pascal_tri {
    public static void main(String[] args) {
            int[][] rarr = new int[5][];
            int i, j;

            for (i = 0; i < rarr.length; i++) {
                rarr[i] = new int [i + 1];
            }

            for (i = 0; i < rarr.length; i++) {
                for (j = 0; j < rarr[i].length; j++) {
                    rarr[i][j] = j + 1;
                }
            }

            for (i = 0; i < rarr.length; i++) {
                for (j = 0; j < rarr[i].length; j++) {
                    if (j == 0 || i == j) {
                        rarr[i][i] = 1;
                    } else {
                        rarr[i][j] = rarr[i - 1][j] + rarr[i - 1][j - 1];
                    }
                    System.out.print(rarr[i][j] + " ");
                }
                System.out.println();
            }

    }
}
