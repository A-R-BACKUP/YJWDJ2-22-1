package W06;

/*
1. 다음과 같은 클래스 정의에 대하여 답하라
(1) 위의 코드에서 수퍼 클래스는 Student이고 서브 클래스는 GraduateStudent이다.
(2) 위의 클래스 관계를 나타내는 UML 도형을 그려라.
(3) 각 필드의 접근자와 설정자를 작성하라.
(4) 생성사를 추가하여 보라. 서브 클래스의 생성자에서 수퍼 클래스의 생성자를 명시적으로 호출하게 하라.
 */

class Student { // 기본 생성자 (자동으로 생겼다)
    private int number;
    public String name;

//    public Student(){
//        // 기본 생성자
//    }

    public Student(int number, String name){
        // 기본 생성자
        // 슈퍼 클래스의 생성자를 명시적으로 생성
    }

    public void setNumber(int number) {
        this.number = number;  // 설정자
    }

    public int getNumber() {
        return number;   // 접근자
    }
}

public class W06_Q_1 extends Student {
    public String lab;
    public W06_Q_1(){
        super(1,"ganada");
        // 슈퍼 클래스의 생성자를 명시적으로 호출
    }
    public static void main(String[] args) {
        Student sex = new Student(1,"ganada");  // 객체를 변수에 담는다
        sex.setNumber(123);   // number 설정
        System.out.println(sex.getNumber());   // number 출력

    }

}
