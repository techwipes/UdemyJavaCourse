package Lesson19;

public class Test5 {

    public static void main(String[] args) {
        String  [] students = {"Ivanov","Petrov","Sidorov"};
        String  [] exams = {"mat analiz","filosofia"};

        for (String a:students){
            for(String b:exams){
                System.out.println(a + " " + b);
            }

        }
    }
}
