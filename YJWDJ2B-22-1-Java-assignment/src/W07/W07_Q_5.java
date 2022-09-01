package W07;

/*
5. 로또 번호를 생성하는 프로그램을 작성하여 보자. 로또는 1부터 45까지의 숫자 중에서 6개를 선택한다.
    로또 번호는 중복되면 안된다. 따라서 집합을 나타내는 HashSet을 사용하여서 중복을 검사하여 보자.
    Math.random()을 사용하면 0부터 1사이의 난수를 생성 할 수 있다.
    생성된 정수는 HashSet의 contains() 메소드를 이용하여서 이미 선택된 정수인지를 검사한다.
 */

import java.util.*;


public class W07_Q_5 {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<Integer>();
        int d;
        for(int i = 1; i < 7; i++){
            d = (int)(Math.random()*45)+1;
            System.out.println(i + "st num: " + d);
            if(num.contains(d)){
                d = (int)(Math.random()*45)+1;
                System.out.println("retry " + i + "st num: " + d);
                num.add(d);
            } // 동일한 숫자가 나왔다면 지우고 다시 돌린다.
            else {
                num.add(d);
            } // 동일한 숫자가 나오지 않았다면 추가한다.
            System.out.println(num);
        }
        System.out.println("Lotto [set=" + num + "]");
    }
}

/*
RESULT

1st num: 2
[2]
2st num: 22
[2, 22]
3st num: 6
[2, 22, 6]
4st num: 27
[2, 22, 6, 27]
5st num: 27
retry 5st num: 36
[2, 36, 22, 6, 27]
6st num: 19
[2, 19, 36, 22, 6, 27]
Lotto [set=[2, 19, 36, 22, 6, 27]]

 */