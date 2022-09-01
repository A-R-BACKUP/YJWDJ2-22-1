package W08;

/*
1. 정수가 문자열의 형태로 들어있는 파일을 읽어서 오름차순으로
정렬한 다음 정렬된 수자를 문자열의 형태로 파일에 쓰는 프로그램을
작성하라.
 */


import java.io.*;
import java.util.*;

public class W08_Q_1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileReader("W08_Q_1_input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("W08_Q_1_output.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>();

        try {
            while(in.hasNext()) {
                list.add(in.nextInt());
            }
            Collections.sort(list);

            for(int i : list) {
                out.println(i);
            }
        }
        finally {
            in.close();
            out.close();
        }
    }
}
