package W06;

/*
2
(1) 다음과 같은 UML에 해당되는 Circle Cylinder 클래스를 작성하여 보자. getVolume() 메소드에서 getArea()을 사용하여 부피를 계산하도록 하라
(2) TestCylinder 클래스를 작성하고 main()에서 Cylinder()를 호출하여서 obj1 객체를 생성한다.
    obj1의 모든 속성을 접근자를 통하여 출력한다.
    추가로 Cylinder(5.0, 3.0)을 호출하여서 obj2 객체를 생성하고 obj2의 모든 속성을 접근자를 통하여 출력해보자
 */

class TestCylinder{

}

class Circle{
    private double radius;
    private String color;

    Circle(){

    }
    Circle(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius *radius * 3.14;
    }
}
public class W06_Q_2_Cylinder extends Circle{
    private double height;

    W06_Q_2_Cylinder(){

    }
    W06_Q_2_Cylinder(double radius){
        setRadius(radius);
    }
    W06_Q_2_Cylinder(double radius,double height){
        setHeight(height);
        setRadius(radius);
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double getVolume(){
        double volume =  getArea() * getHeight();
        return volume;
    }
    public static void main(String[] args) {
        W06_Q_2_Cylinder obj1 = new W06_Q_2_Cylinder();

        obj1.setRadius(10.1);
        obj1.setHeight(15.0);
        System.out.println(obj1.getVolume());
        System.out.println(obj1.getArea());

        W06_Q_2_Cylinder obj2 = new W06_Q_2_Cylinder(5.0, 3.0);
        double Volume = obj2.getVolume();
        double Height = obj2.getHeight();
        double Area = obj2.getArea();
        double Radius = obj2.getRadius();
        System.out.printf("Volume : %s  \n Height: %s \n Area: %s \n Radius: %s", Volume,Height,Area,Radius);
    }
}
