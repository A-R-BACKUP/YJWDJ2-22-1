package ch06;

class Fraction {
    private int ja, mo;
    public Fraction(int ja, int mo) {this.ja=ja; this.mo=mo;}
    public String toString() {
//        int g = gcd(ja, mo);
        return String.format("%d/%d", ja/gcd(ja,mo), mo/gcd(ja,mo));
    }
    public Fraction add(Fraction f) {
        return new Fraction(ja * f.mo + mo * f.ja, mo * f.mo);
    }
    public Fraction mul(Fraction f) {
        return new Fraction(ja * f.ja, mo * f.mo);
    }
    public static Fraction add(Fraction f1, Fraction f2) {
        return new Fraction(f1.ja * f2.mo + f1.mo * f2.ja, f1.mo * f2.mo);
    }
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a%b);
    }
}

public class FractionExample {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2); // 1/2
        Fraction f2 = new Fraction(2, 3); // 2/3

        System.out.println(f1.add(f2));
        System.out.println(f1.mul(f2));
        System.out.println(Fraction.add(f1, f2));
    }
}
