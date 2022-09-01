package ch04;

public class ragged_array {
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
                System.out.print(rarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
