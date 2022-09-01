package ch08;

/*
5
10 20 30 40 50
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class ch08_IO_Practice {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("IO_Practice_input.txt"));
        PrintWriter pr = new PrintWriter(new FileWriter("IO_Practice_output.txt"));
        int n, sum=0, i;
        double avg;

        n = sc.nextInt();
        for(i=1; i<=n; i++)
            sum += sc.nextInt();

        avg = (double) sum / n;

        pr.println("합 = " + sum);
        pr.println("평균 = " + avg);

        pr.flush();
        pr.close();
    }

}
