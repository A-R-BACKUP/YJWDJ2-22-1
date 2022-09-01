package ch07;

import java.util.*;

public class ch07_LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        long start,end,start2,end2;
        start = System.nanoTime();
        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");
        list.add(1, "APPLE") ;  // 인덱스 1에 “APPLE"을 삽입
        list.set(2, "GRAPE");  // 인덱스 2의 원소를 “GRAPE"로 대체
        list.remove(3); // 인덱스 3의 원소를 삭제한다.
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
        end = System.nanoTime();
        System.out.println(end - start + "Ms");


        start2 = System.nanoTime();
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("하나");
        list2.add("하나2");
        list2.add("하나3");
        list2.add("하나4");
        String s;
        Iterator e = list2.iterator();
        // 순차접근만 가능
        while(e.hasNext()){
            s = (String)e.next();
            System.out.println(s);
        }
        end2 = System.nanoTime();
        System.out.println(end2 - start2 + "MS");
    }
}