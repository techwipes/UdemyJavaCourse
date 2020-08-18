package Homework.Lesson17;

public class ArrayMethods {



    public static void abc(String [] ... arr){

        int dlina =0;  // завели переменную для индексации массива

        for(String[] array2:arr){
                dlina+=array2.length;

        }

    String [] str = new String [dlina];
        int i =0;


        for(String[] array2:arr){
            for (String s2: array2 ){
                str[i]=s2;
                i++;
            }
        }

     for(String s: str){
         System.out.print(s + " ");
     }




    }


    public static void main(String[] args) {

        abc(new String []{"Gege", "Yolo","ZZar"}, new String []{"Gege", "Yolo","ZZar"});



    }
}
