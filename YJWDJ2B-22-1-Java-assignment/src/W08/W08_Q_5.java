package W08;

/*
5. 두개의 텍스트 파일을 비교하여서 일치하는지를 검사하는 프로그램을 작성하시오. (바이트 단위로 비교)
 */

import java.io.*;

public class W08_Q_5 {
    public static void main(String[] args) throws FileNotFoundException {
        boolean equal=true;
        FileInputStream fr1 = new FileInputStream("W08_Q_5_input1.txt");
        FileInputStream fr2 = new FileInputStream("W08_Q_5_input2.txt");
        while (true) {
            try {
                byte c1 = (byte) fr1.read();
                byte c2 = (byte) fr2.read();
                if( c1 ==-1 || c2==-1 )
                    break;
                if( c1 != c2 ){
                    equal = false;
                    break;
                }
            } catch (IOException e) {
                break;
            }
        }
        System.out.println(equal);
        try {
            fr1.close();
            fr2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}