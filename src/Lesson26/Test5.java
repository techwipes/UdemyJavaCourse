package Lesson26;

import Lesson17.Test;

public class Test5 {
    Test5() {
        System.out.println("It's a constructor 1");
    }

    Test5(int a) {
        this();
        System.out.println("It's a constructor 2");
    }


    static {
        System.out.println("It's static init block");
    }

    {
        System.out.println("It's first init block");
    }

    {
        System.out.println("It's second init block");
    }

    static {
        System.out.println("It's static init block 2");
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        Test5 t2 = new Test5(5);


    }
}
