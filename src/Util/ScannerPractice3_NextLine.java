package Util;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your  full name :");
        String fullName=input.nextLine();

        System.out.println("Enter your programming language:");
        String programmingLanguage = input.nextLine();

        System.out.println("full name = "+ fullName);
        System.out.println("programming language = " + programmingLanguage);


        input.close();

    }
}
