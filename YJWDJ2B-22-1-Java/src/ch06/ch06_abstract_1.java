package ch06;

// 추상 클래스 (abstract class): 몸체가 구현되지 않은 메소드를 가지고 있는 클래스
// 추상 클래스는 추상적인 개념을 표현하는데 적당하다.
//s instanceof Rectangle
//s instanceof Shape
//s instanceof Object
//s instanceof Circle

public class ch06_abstract_1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Shape s1 = new Rectangle(); // Upcasting = 상향 형변환
        Shape s2 = new Circle();

        s1.draw();
        s2.draw();
    }
}

abstract class Shape {
    private int x, y;
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    public abstract void draw();
}

class Rectangle extends Shape {
    private int width, height;
    public void draw() { // 추상 메소드 구현
        System.out.println("사각형 그리기 메소드");
    }
}

class Circle extends Shape {
    private int radius;
    public void draw() {
        System.out.println("원 그리기 메소드");
    }
}
