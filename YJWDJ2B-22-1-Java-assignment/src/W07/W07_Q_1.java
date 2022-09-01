package W07;

/*
1. 타입 매개 변수 T를 가지는 클래스 MyMath를 작성하여 보자. MyMath에는 평균을 구하는
    getAverage() 메소드를 추가하여 보자. Integer나 Double과 같은 다양한 타입의
    데이터에 대하여 평균을 구할 수 있도록 하라.
 */

import java.util.ArrayList;

class MyMath<AV extends Number>{
    double d = 0.0;
    public double getAverage(AV[] a) {
        for(int i=0; i<a.length; i++)
            d+= a[i].doubleValue();
        return d/a.length;
    }
}


public  class W07_Q_1{
    public static void main(String[] args){
        Integer[] list = {5, 8, 7, 7, 4, 4, 8, 5};
        Double [] list2 = {5.8, 7.7, 4.4, 8.5, 6.9, 7.4, 8.9};
        MyMath<Integer> m = new MyMath<Integer>();
        System.out.println( m.getAverage(list));
        MyMath<Double> m2 = new MyMath<Double>();
        System.out.println(m2.getAverage(list2));
    }
}
