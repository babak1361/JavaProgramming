package Day26_CustomMethodPractice;

import Utilities.ArraysUtility;

public class RemoveElement2 {
    //removes the index from the array
    public static int[] removeElement(int[] array, int index){
        int [] result ={};
        for (int i = 0; i < array.length; i++) {
            if(i != index){
                ArraysUtility.addElement(result,array[i]);
            }

        }
        return result;

    }
}
