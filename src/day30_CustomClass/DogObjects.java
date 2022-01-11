package day30_CustomClass;

import java.util.AbstractList;
import java.util.ArrayList;

public class DogObjects {

    public static void main(String[] args) {

       Dog dog1 = new Dog();
       dog1.name="Lucy";
       dog1.bread="Husky";
       dog1.age=5;
       dog1.gender='f';
       dog1.size="Small";
       dog1.color="White";

       Dog dog2 =new Dog();

       dog2.name="ACE";
       dog2.bread="Husky";
       dog2.age=5;
       dog2.gender='M';
       dog2.size="Large";
       dog2.color="White & Black";

       Dog dog3 = new Dog();
       dog3.setInfo("Jack","German Shiper",2,'M',"Small","White");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();


        Dog dog4 = new Dog();
        dog4.setInfo("Bullet","Labrador",3,'M',"Large","White");            System.out.println(dog4);

        Dog dog5 = new Dog();
        dog5.setInfo("Jack","German",3,'F',"Small","Black");


        System.out.println("________________________");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        AbstractList<Dog> femaleDogs= new ArrayList<>();
        AbstractList<Dog> maleDogs = new ArrayList<>();


    }


}
