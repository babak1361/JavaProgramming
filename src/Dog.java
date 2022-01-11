import java.util.AbstractList;
import java.util.ArrayList;

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

class DogObjects{

    public static void main(String[] args) {

        day30_CustomClass.Dog dog1 = new day30_CustomClass.Dog();
        dog1.name="Lucy";
        dog1.bread="Husky";
        dog1.age=5;
        dog1.gender='f';
        dog1.size="Small";
        dog1.color="White";

        day30_CustomClass.Dog dog2 =new day30_CustomClass.Dog();

        dog2.name="ACE";
        dog2.bread="Husky";
        dog2.age=5;
        dog2.gender='M';
        dog2.size="Large";
        dog2.color="White & Black";

        day30_CustomClass.Dog dog3 = new day30_CustomClass.Dog();
        dog3.setInfo("Jack","German Shiper",2,'M',"Small","White");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();


        day30_CustomClass.Dog dog4 = new day30_CustomClass.Dog();
        dog4.setInfo("Bullet","Labrador",3,'M',"Large","White");            System.out.println(dog4);

        day30_CustomClass.Dog dog5 = new day30_CustomClass.Dog();
        dog5.setInfo("Jack","German",3,'F',"Small","Black");


        System.out.println("________________________");

        day30_CustomClass.Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        AbstractList<day30_CustomClass.Dog> femaleDogs= new ArrayList<>();
        AbstractList<day30_CustomClass.Dog> maleDogs = new ArrayList<>();


    }


}


