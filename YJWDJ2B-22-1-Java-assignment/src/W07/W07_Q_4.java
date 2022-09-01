package W07;

/*
4. 학생들의 정보를 ArrayList에 저장하고 검색할 수 있는 프로그램을 작성하라.
    학생들의 정보는 Student라는 클래스로 나타낸다. Student는 학생의 이름, 주소, 전화번호 등의 필드로 가진다.
    적절한 접근자와 설정자를 작성하라. 학생들의 정보를 추가하고 검색하고 삭제하는 간단한 메뉴를 제공한다.
    ArrayList의 원소들을 처리할 때 for-each 루프를 사용하라.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class W07_Q_4 {
    String name, address, phone;

    public W07_Q_4(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public static void main(String str[]) {
        Scanner scan = new Scanner(System.in);
        String name, address, phone;
        int num;
        ArrayList<W07_Q_4> list = new ArrayList<W07_Q_4>();
        W07_Q_4 student;
        student = new W07_Q_4("Donghyeon", "Tokyo", "9999-7777");
        list.add(student);
        student = new W07_Q_4("Changhoon", "Osaka", "8888-6666");
        list.add(student);
        student = new W07_Q_4("Ryuji", "Tokyo", "5555-3333");
        list.add(student);
        while (true) {
            System.out.println("1.Add 2.Search 3.Delete 4.Exit");
            num = scan.nextInt();
            switch (num) {
                case 1:
                    System.out.print("Name : ");
                    name = scan.next();
                    System.out.print("Address(City) : ");
                    address = scan.next();
                    System.out.print("Phone : ");
                    phone = scan.next();
                    student = new W07_Q_4(name, address, phone);// 입력받은 데이터로 객체 생성
                    list.add(student);// 리스트에 넣기
                    break;
                case 2:
                    System.out.print("Search by name : ");
                    name = scan.next();
                    for (W07_Q_4 s : list) {
                        if (s.name.equals(name))// 찾는 이름을 찾으면 화면에 출력
                        {
                            System.out.println("===== Result =====");
                            System.out.println("Name : " + s.name);
                            System.out.println("Address(City) : " + s.address);
                            System.out.println("Phone : " + s.phone);
                            System.out.println("====================");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Delete person name : ");
                    name = scan.next();
                    for (W07_Q_4 s : list) {
                        if (s.name.equals(name))// 삭제할 객체를 찾으면
                        {
                            list.remove(s);// 삭제
                            break;
                        }
                    }
                    break;
                case 4:
                    return;
            }
        }
    }
}
