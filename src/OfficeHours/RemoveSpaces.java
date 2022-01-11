package OfficeHours;

import java.util.Arrays;

public class RemoveSpaces {
    /*  (RemoveSpaces)

     Task 3 : Write a method that can remove  all extra space from String


          Input: "  Hello world      I      love      Java    "
             Output: Hello world I love Java

                     */
    public static void main(String[] args) {
        String str="  Hello world      I      love      Java    ";
        removeSpaces(str);
    }
    public static void removeSpaces(String str){
        String result="";
        String[] strArr = str.trim().split(" ");
        System.out.println(Arrays.toString(strArr));
        for( String each:strArr){
            if(!each.isEmpty()){
                result+=each+" ";
            }
        }
        System.out.println(result.trim());
    }
}
