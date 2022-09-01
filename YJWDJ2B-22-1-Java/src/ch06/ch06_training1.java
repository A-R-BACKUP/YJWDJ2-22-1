package ch06;

class Parent{
    public Parent(){
        System.out.println("P1");
    }
    public Parent(String m){
        System.out.println("P2");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("C1");
    }
    public Child(String m){
        System.out.println("C2");
    }
}



public class ch06_training1 {
    public static void main(String[] args) {
        Child c = new Child("m");
        Child d = new Child();
    }
}