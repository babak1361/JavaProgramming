package Day29_ArrayList;

import Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) %2 !=0){
                list.remove(i);
            }
        }

        System.out.println(list);

        list.removeIf(p -> p < 5 );// lambda Expression

        System.out.println(list);
        System.out.println("__________________________");

        ArrayList<Integer> list2 =new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));// remove all even number
        list2.removeIf(each -> each%2 ==0 );// way to find the even
        System.out.println(list2);

        System.out.println("________________________________");

        ArrayList<String> list3=new ArrayList<>();
        list3.addAll(Arrays.asList("Java","python","Javascript","C#","C++","Java","Java"));

        list3.removeIf(p ->p.startsWith("J"));
        System.out.println(list3);
        System.out.println("__________________________________");
        // remove all the palindrome
        ArrayList<String> names =new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Racecar","Level","Eye","Java","Cydeo"));

        names.removeIf(name -> StringUtility.isPalindrome(name));// remove all the palindrome
        names.removeIf(name -> !StringUtility.isPalindrome(name));// remove all the not palindrome
        System.out.println(names);


    }
}
