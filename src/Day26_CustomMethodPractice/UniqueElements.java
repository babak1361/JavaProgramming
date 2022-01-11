package Day26_CustomMethodPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] array ={1,1,2,3,3,4,5,5,6,7,7,7,2,4,6};// there is zero unique element
        int[] unique=uniqueElements(array);
        System.out.println(Arrays.toString(unique));
    }
    public static int[] uniqueElements(int[] array){
        int[] result ={};// it is just for temp
        for (int each : array) {
            // it means the element is unique by ==1
            if(ArraysUtility.frequencyOfElement(array,each)==1){// if the frequency is 1 then the element is unique
               result= ArraysUtility.addElement(result,each);// array just contain the unique element only
            }
        }
        return result;
    }
}
