package ch05;

// 중복 정의 = Overloading
// cf) Overriding (재정의)

// 실습) Time 클래스 작성, 사용
//      필드: int h, m, s
//      생성자, 접근자, 설정자
//      기본생성자 => 현재 시각으로 초기화
//      toString() => "11:43:09"

import java.util.Date;

    class Time{
        private int h,m,s; // 필드
        public Time(){ // 기본 생성자
            Date today = new Date();
            h = today.getHours();
            m = today.getMinutes();
            s = today.getSeconds();
        }
        public int getH(){return h;}
        public int getM(){return m;} // 접근자
        public int gets(){return s;}

        public void setH(int h){this.h = h;}
        public void setM(int m){this.m = m;}
        public void setS(int s){this.s = s;} // 설정자

        public Time(int h,int m,int s){
            this.h = h; // 생성자 오버로딩
            this.m = m;
            this.s = s;
        }
        @Override
        public String toString() {
            return String.format("%02d:%02d:%02d", h ,m ,s);
        }

    }

    public class ch05_Overloading {
        public static void main(String[] args) {
            Time time1 = new Time();
            Time time = new Time(11, 43, 9);
            System.out.println(time);

        }
    }
