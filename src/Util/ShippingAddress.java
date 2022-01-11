package Util;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your address :");
        String address =scan.nextLine();

        System.out.println("Enter your zip code :");
        int zipcode = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your Street name :");
        String streetName = scan.nextLine();

        System.out.println("Enter your city name :");
        String CityName = scan.nextLine();


        scan.close();






    }
}

/*
1.ask user Enter your Full name ( nextLine()   )
2. Enter your Building Number  ( next()   )
3. Enter your Street name  (    nextLine()   )
4.Enter your city name   ( NextLine() )
5.Enter your State name ( Next () )
6.Enter your zip code ( next ()   )

  Display your Shipping Address
 */
