package ch07;

/* 시험 */
import java.util.*;

public class ch07_AsList {
    public static void main(String[] args) {
        String[] sarr = {"one","two","Three"};
        // Array와 List는 다름.
        List<String> list = Arrays.asList(sarr);
        List<String> list3 = new ArrayList<>(Arrays.asList(sarr));
        // ToString 자동 구현 list 객체를 만든것이 아니라 심벌릭 링크만 한것.

        sarr[0] = "zero"; // list배열도 같이 바뀜.
        System.out.println(list3);
        System.out.println(list);
        System.out.println(sarr);
        System.out.println(Arrays.toString(sarr));
        ArrayList<Integer> list1 = new ArrayList<>();

    }
}