package Raplit;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
        int a=0;
        int b=1;
        int c;


        for (int i = 0; i <num; i++) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
return ;

        }

        System.out.println(num);
    }

    public static void fib(int num){


    }
}
/*Complete a method fib() that will compute Fibonacci numbers

In the Fibonacci series, the next number is the sum of previous two numbers. For example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, etc... The first two numbers of the Fibonacci series are 0 and 1. (Counting starts with an index 0, so the 0th number is 0, 1st number is 1, etc)

You are given a number num, print n-th Fibonacci Number.

Examples:

Input  : 2
Output : 1
(Explanation : because number 2 in the sequence of 0, 1, 1 --> 1)
Input  : 2
Output : 1
(Explanation : because number 2 in the sequence of 0, 1, 1 --> 1)
Input  : 8
Output : 21
(Explanation : because number 8 in the sequence of
  0, 1, 1, 2, 3, 5, 8, 13, 21 --> 21)

 */