package W05;

class MyDate{
    int year;
    int month;
    int day;
    String monthly;
    String print1(){
        return (year +"."+month +"."+ day);
    }
    String print2(){
        return (monthly +" "+ day +","+ year);
    }
}

public class W05_Q_1 {
    public static void main(String[] args) {
        MyDate pd = new MyDate();
        pd.year = 2012;
        pd.month = 7;
        pd.monthly = "July";
        pd.day = 12;
        System.out.println(pd.print1());
        System.out.print(pd.print2());
    }
}