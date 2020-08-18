package Lesson24;

public class Test1 {


}


class A{
    String g = "toje est";
    String s = "privet";
    void abc(){
        System.out.println("???");
    }
}

class B extends A {

    String s = "poka";
    String g = "drugoye";
    void abc() {
        System.out.println("!!!");
    }
}


class C extends B{

    public static void main(String[] args) {
        C c = new C();
        c.abc();
        System.out.println(c.s);
        System.out.println(c.g);
        A a = new C();
        a.abc();
        System.out.println(a.s);
        System.out.println(a.g);


    }


}