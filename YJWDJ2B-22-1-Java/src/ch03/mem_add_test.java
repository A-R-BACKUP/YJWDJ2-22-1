package ch03;

public class mem_add_test {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = "Hello";
        String s4 = new String("Hello");
        /*
        new를 하면 새로운 객체 생성한다. 그래서 s2와 s4의 주소값은 다르다.
        반면 new를 하지 않는다면 동일한 것을 재 할당 하지 않아 동일한 것은 동일한 주소를 가진다.
        고로 s1의 주소값가 s3의 주소값은 동일
         */
        System.out.println(s2 == s4); // false
        System.out.println(s1 == s3); // true

    }
}
