package W07;

/*
2. 제네릭을 사용하여서 똑같은 타입의 객체 두개를 저장하는 Pair 클래스를 작성하여 보자.
    생성자와 접근자, 설정자, toString() 메소드를 정의하라. String을 저장하여 다음과
    같이 테스트하여 보라.
 */

public class W07_Q_2 {
    public static void main(String[] args) {
        MyPair<String> kudamono = new MyPair<String>("Apple", "Grape");
        System.out.println(kudamono);
        MyPair<String> kudamono2 = new MyPair<String>("Suika", "Melon");
        System.out.println(kudamono2);

    }
}

class MyPair<k> {
    k a;
    k b;

    public MyPair(k a, k b) {
        this.a = a;
        this.b = b;
    }

    public k getA() {
        return a;
    }

    public k getB() {
        return b;
    }

    public void setA(k a) {
        this.a = a;
    }

    public void setB(k b) {
        this.b = b;
    }

    public String toString() {
        return a.toString() + " " + b.toString();
    }
}
