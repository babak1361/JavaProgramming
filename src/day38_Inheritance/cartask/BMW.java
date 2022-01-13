package day38_Inheritance.cartask;

public class BMW extends Car {

    public BMW( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breakDown(){
        System.out.println(brand+" "+model+" is breakDown");
    }

    public void racing(){
        System.out.println(brand+" "+model+" is racing");
    }


}
/*
 2. BMW:
                extra methods:
                    breaksDown()
                    racing()
 */