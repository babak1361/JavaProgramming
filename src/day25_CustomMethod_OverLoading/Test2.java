package day25_CustomMethod_OverLoading;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};

        ArraysUtility.printEachElement(arr1);
        System.out.println("___________________________");

        double[] arr2 ={1.5,2.5,3.5,4.5};
        ArraysUtility.printEachElement(arr2);

        System.out.println("_______________________________");
        char[] arr3={'A','B','C','D'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("___________________________");
        String[] names ={"Ali","Hum","jef","bab"};
        ArraysUtility.printEachElement(names);

        System.out.println("______________________________");
        int[] n1 = {1,2,3,4,5,10};
        int max1=ArraysUtility.max(n1);
        System.out.println("max1 = " + max1);

        System.out.println("_____________________________");
        double[] n2 = {10.5,12.5,15.8,20.9,10.9};
        double max2=ArraysUtility.max(n2);
        System.out.println("max2 = " + max2);

        System.out.println("_____________________________");
        int[] a1 ={1,2,3,4,5,6,7};
       boolean r1 = ArraysUtility.contain(a1,5);
        System.out.println("r1 = " + r1);

        System.out.println("_______________________________");






    }
}
