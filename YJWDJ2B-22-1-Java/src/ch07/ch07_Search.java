package ch07;

import java.util.*;

public class ch07_Search {
    public static void main(String[] args) {
        int key = 50;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        int index = Collections.binarySearch(list, key);
        System.out.println("탐색의 반환값 = " + index);
    }
}
