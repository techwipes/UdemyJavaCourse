package Lesson24;

public class Test2 {
}



abstract class  Figura{
    int kolichestvostoron = 0;
abstract void perimetr();
abstract void ploshad();
void showInfo(){
    System.out.println("Eto figura");
}
}

class Kvadrat extends Figura {
    int storona = 10;
    int kolichestvostoron = 4;

    public void perimetr() {
        System.out.println("P kvadrata= " + 4 * storona);
    }


    public void ploshad(){
    System.out.println("S kvadrata = " + storona * storona);
}

}

class Pryamougolnik extends Figura{
    int storona1 = 8;
    int storona2 = 5;
    int kolichestvostoron = 4;

    public void perimetr() {
        System.out.println("P kvadrata= " + 2*(storona1+storona2));
    }


    public void ploshad(){
        System.out.println("S kvadrata = " + storona1 * storona2);
    }



}

class Okrujnost extends Figura{
    int radius = 3;
    int kolichestvostoron = 0;

    public void perimetr() {
        System.out.println("P kvadrata= " + 2*3.14*radius);
    }


    public void ploshad(){
        System.out.println("S kvadrata = " + 3.14*radius*radius);
    }

}

abstract class Chetrirehugolnik extends Figura{
    void def (){
        System.out.println("Eto chetirehugolnik");
    }

}