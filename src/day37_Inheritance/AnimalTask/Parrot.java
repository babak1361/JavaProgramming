package day37_Inheritance.AnimalTask;

//           Sub Class      super class
public class Parrot extends Animal{

   // public String parrotWingColor;
    public Parrot(String name, String bread, char gender, int age, String size, String color) {
        super(name, bread, gender, age, size, color);
       // this.parrotWingColor= parrotWingColor;
    }

    public void sing(){
        System.out.println(name+" is singing");
    }


    public void run(){
        System.out.println(name+" is running");
    }



    public void fastestAnimal(){
        System.out.println(name+" is fastest Animal");
    }


}
