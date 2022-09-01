package W07;

/*
3. 장기 자랑 프로그램에 사용될 수 있는 심사 위원들의 점수를 집계하는 프로그램을 작성하라.
    점수는 0.0에서 10.0까지 가능하다. 10명의 점수 중에서 최저 점수와 최고 점수는 제외된다.
    Double 타입의 ArrayList를 사용하라.
 */

import java.util.*;

public class W07_Q_3 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);
        double num;
        double sum = 0.0;
        for (int i = 0; i < 10; i++)
        {
            System.out.print("심사위원 점수 입력: ");
            num = input.nextDouble();
            if (num > 10.0)
            {
                System.out.println("10점이하로 입력");
                i--;
            }
            else
                list.add(num);
        }
        Collections.sort(list); // 점수 정렬
        Iterator e = list.iterator();
        while (e.hasNext())
        {
            sum += (double) e.next();
        }
        sum -= list.get(0); // 최저 점수 제외
        sum -= list.get(9); // 최고 점수 무시
        System.out.println("점수의 합 : " + sum);
    }
}