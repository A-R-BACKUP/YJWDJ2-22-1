package W06;

/*
4. Person 이라는 클래스를 정의하라. Person은 이름(name)과 키 (height)를 필드로 가진다.
    Person은 본문에 나오는 Comparable 인터페이스를 구현한다. 이 Comparable 인터페이스를
    이용하여서 가장 키 큰 사람의 이름을 반환하는 메소드 getMaximum(Person[] array)을 구현하고 테스트하라.ㄴ
 */

public class W06_Q_4_PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person("가나다", 172);
        Person p2 = new Person("라마바", 172);

        p1.compareTo(p2);
        if(p1.compareTo(p2) == 1){
            System.out.println(p1+"ABC");
        }else if(p1.compareTo(p2) == -1){
            System.out.println(p2+"ABC");
        }else{
            System.out.println("BBBBBBBB");
        }
    }
}


class Person implements Comparable<Person>{
    private String name;
    private int height;

    Person(String name, int height){
        this.name = name;
        this.height = height;
    }

    Person(int height){
        this.height = height;
    }

    @Override
    public int compareTo(Person i) {
        if(this.height > i.height){
            return 1;
        }else if(this.height < i.height){
            return -1;
        }else{
            return 0;
        }
    }
    @Override
    public String toString() {
        return String.format("가장 키가 큰 사람은 %s", this.name);
    }
}