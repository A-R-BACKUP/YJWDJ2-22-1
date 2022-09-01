package ch07;

import java.util.*;

public class ch07_sort {
    public static void main(String[] args) {
        String[] sample = {"i", "walk", "the", "line"};
        // List<String> list = Arrays.asList(sample);
        List<String> list = new ArrayList<>(Arrays.asList(sample));
        Collections.sort(list);

        System.out.println(list);

        System.out.println(Arrays.toString(sample));
    }
}
