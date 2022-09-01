package ch05;

/*
문제) 가로, 세로, 깊이 => 부피, 겉넓이

1) 절차 지향

2) 객체 지향
    1. 객체 추상화: 박스
        - 상태: 가로, 세로, 깊이
        - 동작: 부피, 겉넓이

    2. UML
        Box
        ----------
        +w: int
        +h: int
        +d: int
        ----------
        +volume(): int
        +area(): int


 */

public class ch05_Training1 {
    public static void main(String[] args) {
        int w = 10, h = 20, d = 30;
//      System.out.println("부피: " + volume(w,h,d));
//      System.out.println("겉넓이: " + area(w,h,d));
//      절차 지향식

        Box z = new Box(w, h, d);
        System.out.println("z부피: " + z.volume());
        System.out.println("z겉넓이: " + z.area());


        Box c = new Box();
        c.setW(20);
        c.setH(30);
        c.setD(40);
        System.out.println("c부피: " + c.volume());
        System.out.println("c겉넓이: " + c.area());



        Box b = new Box();
        b.w = 10; b.h = 20; b.d= 30;
        System.out.println("b부피: " + b.volume());
        System.out.println("b겉넓이: " + b.area());
    }

    static int volume(int w, int h, int d) {
        return w * h * d;       // 부피 반환
    }

    static int area(int w, int h, int d) {
        return (w * h + h * d + d * w) * 2;     // 겉넓이 반환
    }

    // 절차 지향식
}

class Box {     // 객체 지향식
    int w, h, d;        // 필드

    public Box() { w = h = d = 0;}

    public Box(int w, int h, int d) {
        this.w = w; this.h = h; this.d = d;
        // 전달 받은 값으로 필드를 초기화
    }


    public int getW() { return w; }
    public void setW(int w) { this.w = w; }
    public int getH() { return w; }
    public void setH(int h) { this.h = h; }
    public int getD() { return w; }
    public void setD(int d) { this.d = d; }

    int volume() {
        return w * h * d;
    }

    int area() {
        return (w * h + h * d + d * w) * 2;     // 겉넓이 반환
    }
}