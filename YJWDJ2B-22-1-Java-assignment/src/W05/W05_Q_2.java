package W05;

// 기말에 나올 수 있다고 하셨음....

//class ComplexNumber{
//    int real;
//    int imag;
//    String print_sum(){
//        return (real + " + " + imag + "i");
//    }
//    String print_mult(){
//        return (real + " * " + imag + "i");
//    }
//}
//
//public class W05_Q_2 {
//    public static void main(String[] args) {
//        ComplexNumber cn = new ComplexNumber();
//        cn.real = 10;
//        cn.imag = 21;
//        System.out.println(cn.print_sum());
//        System.out.println(cn.print_mult());
//    }
//} 게다가 이런식으로 푸는게 아니라고 함....

// 창훈이가 풀은 코드

public class W05_Q_2  {
    public static void main(String[] args) {
        Complex c1 = new Complex(1,2);
        Complex c2 = new Complex(3,4);
        Complex c3 = new Complex(5,6);
        c1 = c1.add(c2);
        c2 = c2.mulComplex(c3);
        System.out.println("add = "+c1);
        System.out.println("Multi = "+c2);
        System.out.println("Abs = " + c3.abs());
    }
}

// 시험문제관련

class Complex{
    private double r;
    private double i;
    Complex(double r,double i){
        this.r = r;
        this.i = i;
    }
    public Complex add(Complex c){
        return new Complex(this.r+c.r,this.i+c.i);
    }
    public Complex mulComplex(Complex c) {
        Complex c0 = new Complex(0,0);
        c0.r = r * c.r - i * c.i;
        c0.i = r * c.i + i * c.r;
        return new Complex(r*c.i+i*c.r,r*c.r-i*c.i);
    }
    public double abs(){
        return Math.sqrt(r*r+i*i);
    }

    public String toString() {
        if (i < 0) {
            return String.format("%s%si", r, i);
        } else {
            return String.format("%s+%si", r, i);
        }
    }
}