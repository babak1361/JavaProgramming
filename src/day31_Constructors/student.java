package day31_Constructors;

public class student {

    public String name;
    public int age;
    public char gender;
    public char grade;
    public int ID;

    public student(String name, int age, char gender, char grade, int ID){
        this.name = name;
        this.age =age;
        this.gender =gender;
        this.grade =grade;
        this.ID=ID;

    }

    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", ID=" + ID +
                '}';
    }


}
