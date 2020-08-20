package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test7 {

    static int abc(){
        File f = new File("test.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            return 5;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return 2;
        }finally {
            System.out.println("final block");
        }
    }

    public static void main(String[] args) {
        System.out.println(abc());

    }
}
