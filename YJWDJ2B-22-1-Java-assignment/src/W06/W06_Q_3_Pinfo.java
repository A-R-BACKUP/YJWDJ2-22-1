package W06;

/*
3. 다음 그리에 해당하는 클래스를 작성하여 보자. 모든 학생은 이름, 학번, 소속 학과, 학년, 이수 학점 수를 가진다.
    추가적으로 학부생은 소속 동아리 명을 가지고 있고 대학원생은 조교 유형과 장학금 비율을 가진다.
    조교 우형에는 교육 조교와 연구 조교가 있으며 장학금 비율은 0과 1사이의 값이다. 각 클래스는 적절한 생성자 메소드,
    접근자 메소드, 변경자 메소드를 가진다. 이러한 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 테스트 클래스를 작성라하.
 */


public class W06_Q_3_Pinfo extends Student1 {
    W06_Q_3_Pinfo() {
        super(1, "이동현");
    }

    public String lab;
    // 서브클래스
    public static void main(String[] args) {
        Student1 s1 = new W06_Q_3_Pinfo();
        s1.name = "sex";
    }
}

class Student1{
    private int number;
    public String name;
    // super클래스

    Student1(int grade, int sid, String name2, String department, int point){

    }

    Student1(int number,String name){
        this.number =number;
        this.name =name;
    }

    public void setNumber(int number) {
        this.number = number;
    } // 설정자

    public int getNumber() {
        return number;
    } // 접근자

    public void setName(String name) {
        this.name = name;
    } // 설정자

    public String getName() {
        return name;
    } // 접근자


}