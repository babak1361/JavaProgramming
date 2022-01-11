package day32_Connstructors;

public class CarpetObject {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(3,5,8,true);
        Carpet carpet2 = new Carpet(10,20,10,false);


        System.out.println(carpet1);
        System.out.println(carpet2);

    }
}
/*
1create a custom class for the Carpet class that should contain the following:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                instance methods:
                        customOrder(): sets the carpet' width, length, unitPrice, & isPersian
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitPrice

            if the carpet is persian  carpet, add 200$ to the totalPrice
 */