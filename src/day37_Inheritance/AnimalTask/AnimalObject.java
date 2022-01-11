package day37_Inheritance.AnimalTask;

public class AnimalObject {

    public static void main(String[] args) {

        Dog dog1= new Dog("Jesi","Hysky",'F',4,"large","gray");
        dog1.bark();
        dog1.eat();
        dog1.drink();
        System.out.println(dog1);
        System.out.println("==========================================================");


        Cat cat1= new Cat("Lucy","Persion",'F',3,"Small","White");
        cat1.scratch();
        cat1.sleep();
        cat1.eat();
        System.out.println(cat1);

        System.out.println("=================================================================");


        Parrot parrot1 = new Parrot("jem","Macaw",'M',2,"Large","Pink");
        parrot1.fastestAnimal();
        parrot1.run();
        parrot1.sing();
        parrot1.sleep();
        System.out.println(parrot1);

    }
}
