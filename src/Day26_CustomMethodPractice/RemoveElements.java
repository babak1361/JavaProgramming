package Day26_CustomMethodPractice;

public class RemoveElements {

                     //                 {1,2,3,4}  ,  2
    public static int[] removeElement(int[] array, int index) {
        int[] result = new int[array.length-1];
            int j =0;
        for (int each : array) {
            if(each == array[index]){
                continue;// it is use foe skip as soon as get match with index 2
            }
            result [j++] =each;
        }
        return result;

    }
}
/*
2. Create a class named RemoveElements:
            2.1 Create a method that passes two parameters: an integer array and an integer index.
             the method removes the element at the given index of the array and returns the new array
                    Ex:
                        int[] arr = {10,20,30,40}
                        remove(arr, 2) ==> {10, 20, 40}

            2.2 Create a method that passes two parameters: a double array and an integer index.
            the method removes the element at the given index of the array and returns the new array


            2.3 Create a method that passes two parameters: a char array and an integer index.
            the method removes the element at the given index of the array and returns the new array

            2.4 Create a method that passes two parameters: a String array and an integer index.
            the method removes the element at the given index of the array and returns the new array

 */