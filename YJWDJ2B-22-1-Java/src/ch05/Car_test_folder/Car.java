package ch05.Car_test_folder;

public class Car {
    String color, model;
    int speed;
    int gear;

    public String toString() {

        return String.format("Car [Model: %s, color: %s, speed: %s, gear: %s]", model, color, speed, gear);
    }


    // 기존 코드에서 모델명과 색상 추가 해봄
    void setModel(String m) {model = m;}
    void setColor(String c) {color = c;}

    void changeGear(int g) { gear = g;}
    void speedUp() {speed = speed + 10;}
    void speedDown() {speed = speed - 10;}
}
