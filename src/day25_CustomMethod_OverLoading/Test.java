package day25_CustomMethod_OverLoading;

import Utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str ="Java Programming Language";
        StringUtility.printEachChart(str);

        System.out.println("-------------------------------------");
        String s1 = "Wooden Spoon";
        String reverse =StringUtility.reverse(s1);
        System.out.println(reverse);
        System.out.println("-----------------------------------");
        String word ="Civic";
         boolean palindrome =StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);
        System.out.println("_____________________________________");
        String s2 ="aaaaaabbbbbbccccddd";
        String nonDup =StringUtility.removeDuplicates(s2);
        System.out.println("nonDup = " + nonDup);


    }
}
