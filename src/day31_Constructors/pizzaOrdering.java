package day31_Constructors;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class pizzaOrdering {
    public static void main(String[] args) {
           // create 100 pizza objects : size 's', cheese topping-2, pepperoni topping-3
        // create 100 pizza objects : size 'M', cheese topping-3, pepperoni topping-4
        // create 100 pizza objects : size 'L', cheese topping-4, pepperoni topping-5
        AbstractList<pizza> pizzas=new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            pizza small = new pizza('s',2,3);
            pizza mediumPizza = new pizza('m',3,4);
            pizza largePizza= new pizza('L',4,5);


            pizzas.addAll(Arrays.asList(small,mediumPizza,largePizza));

        }


        System.out.println("Total number of pizza : "+pizzas.size());
        double totalPrice =0;

        for (pizza pizza : pizzas) {
            totalPrice += pizza.calcCost();
        }

        System.out.println("totalPrice = " + totalPrice);

    }
}
