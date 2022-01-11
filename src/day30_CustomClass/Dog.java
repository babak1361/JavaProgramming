package day30_CustomClass;

public class Dog {

    public String name;
    public String bread;
    public int age;
    public char gender;
    public String size;
    public String color;

    public  void setInfo(String dogName, String dogBread, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        bread =dogBread;
        age =dogAge;
        gender = dogGender;
        size = dogSize;
        color =dogColor;

    }


    public void eat() {
        System.out.println(name + "is eating");
    }

    public void bark() {
        System.out.println(name + "is barking");
    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}


/*
Attributes:
 name, age, gender, size, color ....



Action:
eat(), play(), bark(), .....

 */