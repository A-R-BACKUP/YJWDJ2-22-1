package W08;

/*
3. 텍스트 파일을 읽어서 앞에 라인 번호를 붙여서 출력하는
프로그램을 작성하라.
라인 번호는 폭이 6이고 오른쪽 정렬되도록 하라.
 */


import java.io.*;

public class W08_Q_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("W08_Q_3_input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("W08_Q_3_output.txt"));

        int lineNumber = 0;

        while (true) {
            lineNumber++;
            String line = in.readLine();

            if (line == null)
                break;
            out.printf("%6d : %s", lineNumber, line);
            out.println();
        }
        in.close();
        out.flush();
        out.close();
    }
}
