package Lesson26;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car car1 = new Car("red" , "v4");
        Car car2 = new Car("red" , "v4");
        Car car3 = new Car("black", "v8");
        ArrayList <Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        Car car4 = new Car("black" , "v8");
        System.out.println(list.contains(car4));
        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));
        System.out.println(car2);
    }
}


class Car{
    String color;
    String engine;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    public boolean equals(Object obj){
        if(obj instanceof Car){
            Car c2 = (Car)obj;
           return (color.equals(c2.color) && engine.equals(c2.engine));
        }else{
            return false;
        }

    }


    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }
}