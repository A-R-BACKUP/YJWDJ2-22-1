package ch08;

import java.io.*;

public class ch08_CharEncodingTest {
    public static void main(String[] args) throws IOException {
        File fileDir = new File("input.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF8"));
        String str;
        while ((str = in.readLine()) != null) {
            System.out.println(str);
        }
    }
}
