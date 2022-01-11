package Day17_While_Dowhile;

import java.util.Locale;
import java.util.Scanner;

public class MarrigeWhileLoop {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("will you marry me :");
        String answer = scan.next();
        while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))) {
            System.out.println("Invalid answer ,  please re_enter");
            System.err.println("will you marry me :");
            answer = scan.next().toLowerCase();

        }if (answer.equals("yas")){
            System.out.println("congrats");
        }else {
            System.out.println("Goodbye");
        }


    }
}
/*
    1. Write a program for the  marriage proposal
    program asking the user, "Will you marry me?"
            if the answer is yes, print "Congrats."
            if the answer is no, print "Goodbye"
            if the answer is neither yes nor no,
            print "Invalid answer, please re-enter"
            and repeat it until the user enters either yes or no

 */

