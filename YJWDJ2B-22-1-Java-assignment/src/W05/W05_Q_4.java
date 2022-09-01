package W05;

import java.util.Scanner;

public class W05_Q_4 {
    public static void main(String[] args) {
        MyCalendar cal = new MyCalendar();
        Scanner sc = new Scanner(System.in);
        int cnt;
        int sum = 0;
        int k=1;
        System.out.print("년 월 일 입력: ");//년월을 입력받아 달력출력
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        System.out.print("연년?: ");
        System.out.println(cal.isLeap(year));
        cnt = cal.calLeap(year, month);
        for(int i =1; i <=cnt; i++){
            System.out.printf("%3d",i);

            if(i>=5*k){
                System.out.println();
                k++;
            }
        }
        System.out.println("\ncal: "+cal.whatDay(year, month, day));
        System.out.println("lastDay : " + cal.lastDate(year, month));
    }
}

class MyCalendar{
    boolean isLeap(int y){
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
            return true;
        else
            return false;
    }
    int calLeap(int y,int m){
        int year = y;
        int month = m;
        int cnt ;
        if(isLeap(year) == true){
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    cnt = 31;
                    break;
                case 2:
                    cnt = 29;
                    break;
                default:
                    cnt = 30;
                    break;
            }
        }else{
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    cnt = 31;
                    break;
                case 2:
                    cnt = 28;
                    break;
                default:
                    cnt = 30;
                    break;
            }
        }
        return cnt;
    }
    int whatDayloof(int y,int m){
        int year = y;
        int month = m;
        int cnt;
        int sum = 0;
        for(int i = 1; i <=month; i++){
            if(isLeap(year)){
                switch(i){//
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        cnt = 31;
                        sum += cnt;
                        break;
                    case 2:
                        cnt = 29;
                        sum += cnt;
                        break;
                    default:
                        cnt = 30;
                        sum += cnt;
                        break;
                }
            }else{
                switch(i){
                    case 1: case 3: case 5:case 7: case 8: case 10: case 12:
                        cnt = 31;
                        sum += cnt;
                        break;
                    case 2:
                        cnt = 28;
                        sum += cnt;
                        break;
                    default:
                        cnt = 30;
                        sum += cnt;
                        break;
                }
            }
        }
        return sum;
    }
    int whatDay(int y, int m, int d){
        int sum = whatDayloof(y, m);
        int year = y;
        int month = m;
        int day = d;
        if(isLeap(year)){
            switch(month){//
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    sum -= 31;
                    break;
                case 2:
                    sum -= 29;
                    break;
                default:
                    sum -= 30;
                    break;
            }
        }else{
            switch(month){
                case 1: case 3: case 5:case 7: case 8: case 10: case 12:
                    sum -= 31;
                    break;
                case 2:
                    sum -= 28;
                    break;
                default:
                    sum -= 30;
                    break;
            }
        }
        return sum+day;
    }

    int lastDate(int y,int m){
        int month = m;
        int year =y;
        return calLeap(year, month);
    }
}