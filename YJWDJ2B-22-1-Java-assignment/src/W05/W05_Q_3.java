package W05;

class Moive{
    String title;
    double grade;
    String dirt;
    int year;
    void Print(){
        System.out.println("영화 제목: " + title);
        System.out.println("평점: " + grade);
        System.out.println("감독: "+ dirt);
        System.out.println("연도: " + year);
    }
}

public class W05_Q_3 {
    public static void main(String[] args) {
        Moive mv = new Moive();
        mv.title = "7번방의 선물";
        mv.grade = 5.0;
        mv.dirt = "이환경";
        mv.year= 2013;
        mv.Print();
    }
}