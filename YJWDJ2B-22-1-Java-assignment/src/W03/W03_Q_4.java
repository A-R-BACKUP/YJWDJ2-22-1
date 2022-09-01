package W03;

import java.util.Scanner;

public class W03_Q_4 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("2진수 입력: ");
    int two = sc.nextInt();
    System.out.println("10진수: "+ten(two));
  }
  public static int ten(int x)
	{
	    if(x==0)
	        return 0;
	    else
	        return (x%10 + 2*ten(x/10));
	}
}
