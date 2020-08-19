package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {

        try {
            File f = new File("test");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception 1");
        } catch (NullPointerException e) {
            System.out.println("Exception 2");
        } catch (Exception e){
            System.out.println("Exception 4");
        }catch (Throwable e){
            System.out.println("Exception 5");
        }
    }
}
