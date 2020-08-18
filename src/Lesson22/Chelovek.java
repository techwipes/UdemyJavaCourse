package Lesson22;

public class Chelovek {

    final String pol;
    private String name;
    private int vosrast;
    private int ves;



    public Chelovek(String pol){
        this.pol = pol;
    }


    public String getName(){
        return name;
    }

    public void setName(String s){
        name=s;
    }


    public int getVosrast(){
        return vosrast;
    }


    public void  setVosrast(int i) {
        if (i > 0) {
            vosrast = i;
        }




    }







    public int getVes(){
    return ves;
}

 public void setVes(int i){
        if(i>0){
            ves= i;
        }


 }


}


class Test{
    public static void main(String[] args) {


        Chelovek c = new Chelovek("male");
        c.setName("Ivan");
        c.setVes(55);
        c.setVosrast(22);

        System.out.println(c.getName());
        System.out.println(c.getVes());
        System.out.println(c.getVosrast());





    }
}