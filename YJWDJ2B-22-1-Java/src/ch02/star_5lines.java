package ch02;

/*
실습) 아래와 같은 모양의 별표 출력

*
* *
* * *
* * * *
* * * * *

이것을 완성하면

* * * * *
* * * *
* * *
* *
*

이거도 해보기
 */

public class star_5lines {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++){
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i <= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if(i >= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
