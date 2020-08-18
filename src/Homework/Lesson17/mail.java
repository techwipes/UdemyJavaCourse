package Homework.Lesson17;

public class mail {

    public static void mails( String s){
          for (int i=0 ; i < s.length(); i++){

            if (s.startsWith("@",i)){
                int sobaka = s.indexOf('@',i);
                int tochka = s.indexOf('.',i);
                System.out.println(s.substring(sobaka+1,tochka));
            }

        }


    }

    public static void main(String[] args) {
        mails("ya@yandex.ru; test@yahoo.com; test2@gmail.com;");


    }

}
