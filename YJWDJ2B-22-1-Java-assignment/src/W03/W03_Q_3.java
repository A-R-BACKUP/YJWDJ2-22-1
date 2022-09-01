package W03;

import java.util.*;

public class W03_Q_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("10진수 입력: ");
    int ten = sc.nextInt();
    binary(ten);
  }

  public static void binary(int x) {
    if (x != 0 && x > 1) {
      int t = x % 2;
      binary(x / 2);
      System.out.print(t);
    } else if (x <= 1) {
      System.out.print(x);
    }
  }
}
