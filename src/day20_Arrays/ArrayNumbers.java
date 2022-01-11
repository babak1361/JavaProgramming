package day20_Arrays;

import java.util.Arrays;

public class ArrayNumbers {
    public static void main(String[] args) {
        int[] number =new int[100];
        for (int i = 1; i <=number.length; i++) {
            number[i-1]=i;

        }
        System.out.println(Arrays.toString(number));
    }
}
/* create an array that has the number 1 to 100

 */