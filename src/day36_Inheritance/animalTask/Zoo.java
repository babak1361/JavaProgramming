package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog =new Dog();
        dog.setInfo("Max","Husky",'M',2,"Small","Black");
        dog.eat();
        dog.drink();
        dog.move();
        dog.bark();

        Cat cat = new Cat();
        cat.setInfo("Lucy","German",'F',5,"Small","Yellow");
        cat.eat();
        cat.scratch();// this own method just for cat that we created in cat class
        cat.drink();
        cat.sleep();


        Tiger tiger =new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',6,"Large","Black");
        tiger.eat();
        tiger.hint();// tiger own method
        tiger.move();
        tiger.roar();// tiger own method
        tiger.drink();

    }
}
