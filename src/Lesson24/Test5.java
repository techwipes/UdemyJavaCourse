package Lesson24;

public class Test5 {
}


interface I1{
    void abc();
    default void def(){
        System.out.println("Eto method def");
    }
    static void deg(){
        System.out.println("Static method");
    }
}

class Z2 implements I1{
    public void abc(){
        System.out.println("Eto method abc");
    }

    public static void main(String[] args) {


        Z2 z2 = new Z2();
        z2.abc();
        z2.def();

    }

}