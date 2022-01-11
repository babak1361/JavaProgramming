package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysConvertToArrayListPractice1 {
    public static void main(String[] args) {

        String[] countries ={"Japan","Korea","united States","Turkey","United Kingdom","Canada"};

        // converting array to Arraylist;
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));
        list.removeIf(p->p.length() >=10);

        //Converting arraylist back to array
       countries= list.toArray(new String[0]);
      System.out.println(Arrays.toString(countries));
    }
}
/*
1.create an Array of String called countries

2. write a program that can remove all the countries names that have length of 10 or greater
 */