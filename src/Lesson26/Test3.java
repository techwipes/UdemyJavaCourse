package Lesson26;

public class Test3 {

    //example 1

    void abc(int i) {
        System.out.println(i);
    }

    void abc(byte i) {
        System.out.println("byte");
    }

    void abc(long i) {
        System.out.println("long");
    }

    // example 2

    void def(Object o) {
        System.out.println("Object");
    }

    void def(String o) {
        System.out.println("String");
    }

    // example 3

    void ghi(int a, int b) {
        System.out.println("Hello1");
    }

    void ghi(long a, long b) {
        System.out.println("Hello2");
    }

    void ghi(Integer a, Integer b) {
        System.out.println("Hello3");
    }

    void ghi(int... a) {
        System.out.println("Hello4");
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(5);
        t.def("Hello");
        t.def(new StringBuilder("Hello"));
        t.ghi(1,2);
    }
}

/**
 Приоритет вызова методов при overloading:
 1. Точное совпадение типа данных
 2. Поглощающие типы данных ( большие типы данных для примитивов и родительские классы для ссылочных)
 3. AutoBoxing
 4. Varargs
*/
