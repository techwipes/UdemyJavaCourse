package Lesson26;

public class Test7 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Lion lion = new Lion();
    }
}

class  Animal{
    Animal(){
        System.out.println("Animal constructor");
    }
    static {
        System.out.println("static block in Animal");
    }
    {
        System.out.println("non static block in Animal");
    }
}

class  Mammal extends Animal{
    Mammal(){
        System.out.println("Mammal constructor");
    }
    static {
        System.out.println("static block in Mammal");
    }
    {
        System.out.println("non static block in Mammal");
    }
}


class  Lion extends Mammal{
    Lion(){
        System.out.println("Loin constructor");
    }
    static {
        System.out.println("static block in Lion");
    }
    {
        System.out.println("non static block in Lion");
    }
}