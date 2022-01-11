package day36_Inheritance.animalTask;

public class Cat extends Animal{ // cat is child that`s why inherited from animal
    // that is why we have 6 variable and 6 methods from animal and also we add two more methods it means totali we have 8 methods in this class
    public void meow(){
        System.out.println(name+" is meowing");
    }

  public void scratch(){
      System.out.println(name+" is scratching");
  }

}
