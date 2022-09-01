package W08;

/*
4. 주어진 2개의 텍스트 파일을 합하여 하나의 파일로 만드는 프로그램을 작성하시오.
 */

import java.io.*;

public class W08_Q_4 {
    public static void main(String[] args) {
        try {
            FileReader fr1 = new FileReader("W08_Q_4_input1.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            FileReader fr2 = new FileReader("W08_Q_4_input2.txt");
            BufferedReader br2 = new BufferedReader(fr2);
            FileWriter fr3 = new FileWriter("W08_Q_4_output.txt");
            PrintWriter br3 = new PrintWriter(fr3);
            while (true) {
                String line = br1.readLine();
                if (line == null)
                    break;
                br3.println(line);
            }
            while (true) {
                String line = br2.readLine();
                if (line == null)
                    break;
                br3.println(line);
            }
            br3.flush();
            fr1.close();
            fr2.close();
            fr3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}