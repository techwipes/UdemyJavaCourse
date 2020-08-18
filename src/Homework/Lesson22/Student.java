package Homework.Lesson22;

public class Student {

    private StringBuilder name;
    private int course;
    private int grade;

    public void setName(StringBuilder s) {
        if (s.length() > 3) {
            this.name = s;
        }
    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setCourse(int i) {
        if (i > 0 & i < 10) {
            course = i;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setGrade(int i) {
        if (i < 0 & i <= 4) {
            grade = i;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void showInfo() {
        System.out.println(getName() + "  " + getCourse() + "   " + getGrade());


    }
}


class StudentTest{

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setCourse(6);
        st1.setCourse(3);
        st1.setName(new StringBuilder("Biba"));
        st1.setGrade(2);
        st1.setName(new StringBuilder("gogog").append("gggerr"));
        st1.getName().append(new StringBuilder("ggggggg"));

        st1.showInfo();



    }
}





