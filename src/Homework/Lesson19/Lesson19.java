package Homework.Lesson19;

public class Lesson19 {




    public static String [] abc (String [] ... array){


        // ищем длину массива для его инициализации
       int dlina=0;
        for (String [] array2:array) {
            dlina+=array2.length;
        }

        String[] Result = new String [dlina];

        int count =0;
        for (String [] array2:array) {
            for (String array3:array2) {
                Result[count]=array3;
                System.out.print(Result[count]+ " ");

                count++;
            }

            }
        System.out.println();
        return Result;
        }









    public static void main(String[] args){
    String  [] students = {"Ivanov","Petrov","Sidorov"};
    String  [] exams = {"mat analiz","filosofia"};
    String[] Array4 = abc(students,exams,students,students);
    for (String s: args){
        for (int i=0; i < Array4.length; i++){
            if (s.equals(Array4[i])){
                Array4[i]=null;
            }
        }
    }

     for(String s:Array4){
         System.out.print(s+ " ");
     }


    }
}

