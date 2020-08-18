package Homework.Lesson17;

public class ravenstvo {

    public static boolean ravenstvoString (StringBuilder sb, StringBuilder sb2) {
        
        char a;
        char b;
        boolean c = false;

      OUTER:  if (sb.length()==sb2.length()) {



           INNER: for (int i = 0; i < sb.length(); i++) {
                       if (sb.charAt(i) != sb2.charAt(i)) {
                       c = false;
                       System.out.println("Eti stroki ne ravni");
                       break OUTER;
                       }
                       else {
                       c = true;
                    }

                 }
            System.out.println("Eti stroki ravni");
        }

         else{
             System.out.println("Eti stroki ne ravni");

         }
        return c;
    }

    public static void main(String[] args) {

       boolean gg;
      gg = ravenstvoString(new StringBuilder("Okey"),new StringBuilder("Okey"));

        System.out.println(gg);

    }


    }

