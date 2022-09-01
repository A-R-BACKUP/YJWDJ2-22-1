package ch05;

public class ch05_StaticMember {
    public static void main(String[] args) {
        Car c1 = new Car("S6000", "White", 80);
        Car c2 = new Car("E500", "blue", 20);
        int n = Car.getNumberOfCars();
        System.out.println("지금까지 생성된 자동차 수 = " + n);
    }
}

class Car {
    private String model;
    private String color;
    private int speed;
    private int id;
    private static int numbers = 0;
    public Car(String m, String c, int s) {
        model = m; color = c; speed = s;
        id = ++ numbers;
    }
    public static int getNumberOfCars(){
        return numbers;
    }
}
