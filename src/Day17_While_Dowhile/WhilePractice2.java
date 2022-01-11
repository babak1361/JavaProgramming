package Day17_While_Dowhile;

import java.util.Locale;
import java.util.Scanner;

public class WhilePractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have car :");
        String answer = scan.next();
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer, please re_enter");
            System.err.println("Do you have car :");
            answer =scan.next().toLowerCase();
               if(answer.equals("yes")){
                System.out.println("congrats");
            }else{
                System.out.println("goodbye");
            }

            }
    }
}


