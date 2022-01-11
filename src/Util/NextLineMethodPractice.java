package Util;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);//Enter
        System.out.println("Enter your age");
        int age = input.nextInt();// 19
        input.nextLine();// make scanner empty


        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("agr = "+ age);
        System.out.println("full name = " + fullName);

        System.out.println(" Enter the GPA");//3.5
        double gpa =input.nextDouble();

        input.nextLine();// to clear the scanner memory


        System.out.println("School Name");
        String schoolName =input.nextLine();


        System.out.println("School Name = "+ schoolName);
        System.out.println("gpa=" + gpa);

        input.close();

    }
}
/* ask user to

 */