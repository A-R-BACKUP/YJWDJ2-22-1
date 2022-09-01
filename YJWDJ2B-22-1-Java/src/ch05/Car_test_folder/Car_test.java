package ch05.Car_test_folder;

public class Car_test {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.changeGear(1);
        myCar.speedUp();
        myCar.setModel("유창훈 병쉰");
        myCar.setColor("유창훈 병쉰색");
        System.out.println(myCar);
    }
}
