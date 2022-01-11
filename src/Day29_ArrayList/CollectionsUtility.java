package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {
// to use the sort method
        ArrayList<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);
        System.out.println(list);
        System.out.println("_______________________");
        //  way to reverse the given Arraylist
        ArrayList<Character> list2 =new ArrayList<>();
                 list2.addAll(Arrays.asList('A','B','C','D','E'));
                 Collections.reverse(list2);
        System.out.println(list2);
      // way to swap the elements
        System.out.println("_________________________");

        ArrayList<Integer> list3= new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));
        Collections.swap(list3,4,1);// does not mather from begining or the end
        System.out.println(list3);
        System.out.println("_______________________________");
        // way to find the max and min number from the collection
        int max = Collections.max(list3);
        int min = Collections.min(list3);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("___________________________");
        // way to replace all in collection
        ArrayList<Integer> list4 =new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));

        Collections.replaceAll(list4,10,1000);// first old element to new
        System.out.println(list4);

        System.out.println("_________________________");

        int frequency = Collections.frequency(list4,1000);
        System.out.println("frequency = " + frequency);

        System.out.println("_____________________________________");
// way to find the frequency
        ArrayList<String> words =new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Python","Python","C3","Java"));
        int countJava = Collections.frequency(words,"Java");
        int countPython = Collections.frequency(words,"Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);









    }
}
