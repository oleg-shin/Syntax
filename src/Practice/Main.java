package Practice;

class Main {
    public static void main(String[] args){
        Child c = new Child();
        c.m2();
    }
}
class Parent{
    void m1(){
        System.out.println("m1 method in parent class");
    }
}
class Child extends Parent{
    void m1(){
        System.out.println("m1 method in child class");
    }

    void m2(){
        m1();
        super.m1();
    }
}