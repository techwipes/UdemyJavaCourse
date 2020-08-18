package Homework.Lesson24;

public class Homework24 {

    public static void main(String[] args) {
        Mechenosec m1 = new Mechenosec("Kilka");
        System.out.println(m1.name);
        m1.eat();
        m1.sleep();
        m1.swim();
        System.out.println();
        Speakable sp1 = new Pingvin("Lelik");
        sp1.speak();
        System.out.println();
        Animal a = new Lev("Styopa");
        System.out.println(a.name);
        a.eat();
        a.sleep();
        System.out.println();
        Mammal m2 = new Lev("Kisa");
        System.out.println(m2.name);
        m2.run();
        m2.eat();
        m2.sleep();
        m2.speak();



    }
}


abstract class Animal{
    String name;
        Animal (String name){
        this.name=name;
    }

    public abstract void eat();
    public  abstract void sleep();
}

abstract class Fish extends Animal{

    Fish (String name){
        super(name);
        this.name=name;

    }
    public void sleep(){
        System.out.println("Vsegda interesno nablyudat kak spyat ribi");}
        abstract void swim();
}

abstract class Mammal extends Animal implements Speakable{
    Mammal (String name){
        super(name);
        this.name=name;
    }
    abstract void run();
}

abstract class Bird extends Animal implements Speakable{

    Bird (String name){
        super(name);
        this.name=name;

    }
    abstract void fly();
    public void speak(){System.out.println(name+"sings");}
}

interface Speakable {
    default void speak(){System.out.println("Somebody speaks");}
}

class Mechenosec extends Fish{
    Mechenosec (String name){
        super(name);
        this.name=name;
    }
    public void swim(){System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet");}
    public void eat(){System.out.println("Mechenosec ne hishnaya riba");}

}

class Pingvin extends Bird{
    Pingvin (String name) {
        super(name);
        this.name=name;
    }
    public void eat(){System.out.println("Pingvin lubit est ribu");}
    public void sleep(){System.out.println("Pingvini spyat prijavshish druk k drugu");}
    public void fly(){System.out.println("Pingvini ne umeyut letat");}
    public void speak(){System.out.println("Pingvini ne poyut kak solovyi");}
}

class Lev extends Mammal{
    Lev (String name) {
        super(name);
        this.name=name;
    }
    public void eat(){System.out.println("Lev lubit est myaso");}
    public void sleep(){System.out.println("Lem mnogo spit dnem");}
    public void run(){System.out.println("Lev eto ne samaya bistraya koshka");}

}