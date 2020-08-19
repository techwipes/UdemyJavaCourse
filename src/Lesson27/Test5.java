package Lesson27;

public class Test5 {
    static void abc(){
        System.out.println("abc method");
        abc(); // error -> StackOverflowError
    }
}

// Exception типа Error не стоит пытаться обработать

