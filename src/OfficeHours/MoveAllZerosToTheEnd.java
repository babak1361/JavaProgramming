package OfficeHours;

import java.util.Arrays;

public class MoveAllZerosToTheEnd {


/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                {10, 5, 1, 0, 0, 0}
 */
public static void main(String[] args) {

    int[] array ={10, 0, 5, 0, 1, 0};
    int[] result=new int[array.length];
     int i =0;
    for (int each : array) {
        if(each!=0){
            result[i]=each;
            i++;

        }
    }
    System.out.println(Arrays.toString(result));

// and also we can solve this task with sort method by create the Arraylist and give coract output

}

}
