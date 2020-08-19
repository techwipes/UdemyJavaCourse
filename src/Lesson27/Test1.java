package Lesson27;

public class Test1 {
    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println(an.a);
        System.out.println(an.b);
        an.abc();
        an.def();
        // 5 - 10 - non static from tiger - static from Animal
    }
}


class Animal {
    int a = 5;
    static int b = 10;

    void abc() {
        System.out.println("Non static method from Animal");
    }

    static void def() {
        System.out.println("Static method from Animal");
    }
}


class Tiger extends Animal {
    int a = 15;
    static int b = 20;

    void abc() {
        System.out.println("Non static method from Tiger");
    }

    static void def() {
        System.out.println("Static method from Tiger");
    }
}