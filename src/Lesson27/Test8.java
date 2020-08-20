package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {


    static void abc() throws FileNotFoundException{
        File f = new File("test.txt");
        try {
            FileInputStream fis = new FileInputStream(f);

        } catch (FileNotFoundException e) {
            System.out.println("catch!");
            throw e;
        }finally {
            System.out.println("final block");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        abc();

    }
}
