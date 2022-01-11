package day36_Inheritance.animalTask;

public class Animal {

    public String name, bread;
    public char gender;
    public int age;
    public String size;
    public String Color;


    public void setInfo(String name, String bread, char gender, int age, String size, String color) {
        this.name = name;
        this.bread = bread;
        this.gender = gender;
        this.age = age;
        this.size = size;
        Color = color;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void move(){
        System.out.println(name+" is moving");

    }

    public void sleep(){
        System.out.println(name+" is sleeping");

    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }
}
/*
             name,breed, gender, size, age, color
            setInfo(), eat(), drink(),move() ,sleep(), toString()
 */