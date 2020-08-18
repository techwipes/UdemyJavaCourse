package Lesson22;

public  class test5 {
      private test5 (){}

    public static void main(String[] args) {

        long bakteriya = 2;
        int count = 0;
        int vremuya =60;

        while (count<vremuya){
            bakteriya*=2;
            count++;
            System.out.println(bakteriya);
        }

        System.out.println(count);
        System.out.println(bakteriya);
    }
}
