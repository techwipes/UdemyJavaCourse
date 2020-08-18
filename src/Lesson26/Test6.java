package Lesson26;

public class Test6 {
    int a = 3;

    Test6() {
        a = 4;
    }

    {
        a = 5;
    }

/*    public static void main(String[] args) {
        Test6 t = new Test6();
        System.out.println(t.a); => 4
    }*/
}

class A {
    static final int b;
    int a = 5;

    static {
        b = 10;
    }
}

class B {
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;

    static {
        c = 5;
        d = 3;
        // e = 1;  error!
        f = 0;
    }
}

class C {
    String s = "ok";

    {
        System.out.println(s);
    }

    static int i = 0;

    static {
        System.out.println(i);
    }

    {
        i += 1;
        System.out.println(i);
    }

    C() {
        System.out.println("Constructor!");
    }

    public static void main(String[] args) {
        System.out.println("hi!");
        C c = new C(); // 0 => hi! => "ok" => 1 => constructor
        D d = new D();  // 2 4 6 8 5 6 8 5
    }


}

class D {
    static {
        abc(2);
    }

    static void abc(int a) {
        System.out.println(a + " ");
    }

    D() {
        abc(5);
    }

    static {
        abc(4);
    }

    {
        abc(6);
    }

    static {
        new D();
    }

    {
        abc(8);
    }

}