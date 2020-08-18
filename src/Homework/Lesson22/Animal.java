package Homework.Lesson22;

public class Animal {

    public Animal(){
        System.out.println("I am animal");
    }

    int eyes;

    void eat (){
        System.out.println("Animal eats");
    }

    void drink(){
        System.out.println("Animal drinks");
    }

}

class Pet extends Animal{

    String name;
    int tail = 1;
    int paw = 4;

    public Pet(){
        System.out.println("I am pet");
        int i =2;
    }

    public void run(){
        System.out.println("Pet run");
    }
    public void jump(){
        System.out.println("Pet jumps");
    }

}

class Dog extends Pet{
    public Dog(String name){
        this.name = name;
        System.out.println("I am a dog and my name is " + name);

    }

    public void play (){
        System.out.println("Dog plays");
    }
}

class Cat extends Pet{
        int eyes=4;
    public Cat(String name){
        this.name = name;
        System.out.println("I am a cat and my name is " + this.name);

    }

    public void sleep(){
        System.out.println("Cat sleeps");
    }
}


class Test{

    public static void main(String[] args) {
        Dog dog = new Dog("Leyka");
        Cat cat = new Cat("Pusha");
        Animal aa = new Cat("pipi");
        System.out.println(dog.paw);
        System.out.println(aa.eyes);
        cat.sleep();

    }
}