package Day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,4};

        arr = removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));

    }


    //
    public static int[] removeDuplicates(int[] array){

        int[] result = {};//{1,

        for (int each : array) {
            if(!ArraysUtility.contain(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }
}
