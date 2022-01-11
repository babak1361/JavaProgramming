package day31_Constructors;

public class pizza {


    public char size;
    public int numberOfCheeseTopping;
    public int NumberOfPepperoniTopping;


    public pizza(char size, int numberOfCheeseTopping, int NumberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.NumberOfPepperoniTopping = NumberOfPepperoniTopping;
    }

    public double calcCost(){
        double startingPrice= (size == 's') ? 10 :(size == 'M')? 12:14;
        double totalPrice = startingPrice +(numberOfCheeseTopping+NumberOfPepperoniTopping)*2;
        return calcCost();


    }

    public String toString() {
        return "pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", getNumberOfPepperoniTopping=" + NumberOfPepperoniTopping +
                ", total price= $" + calcCost() +
                '}';
    }
}
/*
  Pizza Task:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping


 */