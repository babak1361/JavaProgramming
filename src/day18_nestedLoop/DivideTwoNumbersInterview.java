package day18_nestedLoop;

public class DivideTwoNumbersInterview {
    public static void main(String[] args) {
int a =26;
int b = 9;
int count = 0;
while (a > b){
    a -=b;
    count++;

}
        System.out.println(count+"with the remainder of"+a);
    }
}
/* Write a program that can divide two positive numbers
without using / (division) and * (multiplication) operators.

 */