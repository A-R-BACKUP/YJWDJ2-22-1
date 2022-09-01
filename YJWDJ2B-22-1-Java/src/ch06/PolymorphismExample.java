package ch06;

// 다형성

class Animal {
    void speak() {
        System.out.println("...");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("멍멍"); // 강아지 짖는 소리 재정의
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("야옹"); // 고양이 우는 소리 재정의
    }
}

class Cow extends Animal {
    void speak() {
        System.out.println("음메"); // 소 우는 소리 재정의
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal[] ani = {new Dog(), new Cat(), new Cow()};

        for (Animal a : ani) {
            a.speak();
        }
    }
}
