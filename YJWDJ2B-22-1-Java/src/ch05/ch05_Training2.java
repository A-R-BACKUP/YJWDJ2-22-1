package ch05;

/*
중간고사 문제랑 비슷하다고 함... ㄷ?

실습) 두 2차원 벡터의 합과 곱(내적) 수행

예) 벡터 1 = (1,2)
    벡터 2 = (2, 3)
    벡터 1의 크기 = ...
    벡터 2의 크기 = ...
    벡터 합 = (3, 5)
    벡터 내적 = 8 (1 * 2 + 2 * 3)

필드 => 생성자 => 접근자 / 설정자 => toString()

힌트) 벡터 크기 메소드 형식
    public double length() {....}

힌트) 벡터 합 메소드 형식
    public Vector2D add(Vector2D v) {....}

힌트) 벡터 내적 메소드 형식
    public int mult(Vector2D v) {....}
 */

public class ch05_Training2 {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(1, 2);
        Vector2D v2 = new Vector2D(2, 3);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v1.add(v2));
        System.out.println(v1.mult(v2));
    }
}

class Vector2D {
    private int x, y;

    public Vector2D() {}        // 기본생성자

    public Vector2D(int x, int y) { this.x = x; this.y = y; }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    public double length() {
        return Math.sqrt(x*x + y*y);
    }

    public Vector2D add(Vector2D v) {
        return new Vector2D(x + v.x, y + v.y);
    }

    public int mult(Vector2D v){
        return this.x * v.x + this.y * v.y;
    }
}

// 필드를 사용하는 메소드는 Static을 사용할 수 없다.
