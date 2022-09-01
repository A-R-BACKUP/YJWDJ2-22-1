package W06;

/*
5. 도형에 관한 클래스를 다형성을 이용하여서 작성하여 보자. 이 프로그램에서는 사격항이나
    삼각형과 같은 많은 종류의 도형을 사용한다. 먼저 Shape이라는 수퍼 클래스를 작성한다.
    Shape은 모든 도형의 공통된 연산들을 정의한다. 예를 들어서 도형의 면적을 반환하는 calcArea()와 같은 메소드를 정의한다.
    Shape을 상속받는 모든 도형들은 특정한 도형의 면적을 계산하여서 calcArea()를 통하여 반환한다.
    다음의 UML을 참고하여서 전체 프로그램을 작성하라.
 */

public class W06_Q_5_ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(10, 20);
        s1.calcArea();
        System.out.println(s1);
        Shape s2 = new Triangle(10, 20);
        s2.calcArea();
        System.out.println(s2);
    }
}


abstract class Shape{
    private String color;
    public void calcArea(){}
    @Override
    public String toString() {
        return "A";
    }
}

class Rectangle extends Shape{
    private int length;
    private int width;
    public int area;

    Rectangle(int length, int width){
        this.length =length;
        this.width = width;
    }
    public void calcArea() {
        area = length * width;
    }
    @Override
    public String toString() {
        return String.format("넓이는 : %d %d",area,length);
    }

}

class Triangle extends Shape{
    private int base;
    private int height;
    private int area;

    Triangle(int base,int height){
        this.base = base;
        this.height = height;
    }
    public void calcArea(){
        area = (int) (base*height*0.5);
    }
    @Override
    public String toString() {
        return String.format("넓이는 : %d %d %d", area,base,height);
    }

}