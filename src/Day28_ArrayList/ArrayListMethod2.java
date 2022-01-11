package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod2 {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
        Integer num =200;
       boolean r =list.remove(num);
        System.out.println(r);
      //  list.remove(200);
     /*   int num =1;
        list.remove(num);*/

        System.out.println(list);
        System.out.println("______________________________");

        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());

        System.out.println("_______________________");

        ArrayList<Character> character =new ArrayList<>();
        character.add('A');
        character.add('A');
        character.add('A');
        character.add('A');
        character.add('A');

        int a=character.indexOf('A');//0
        int b =character.lastIndexOf('A');//4

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("______________________________");

        boolean r2 =character.contains('A');
        boolean r3 =character.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("__________________________");

        ArrayList<Integer> list1 =new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);


        ArrayList<Integer> list2 =new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2);
        System.out.println(list1.equals(list2));

        System.out.println("_____________________________________");

       boolean r4 = list1.isEmpty();// return false becuse this array has element
        System.out.println("r4 = " + r4);

        System.out.println("__________________________________");

        ArrayList<Integer> numbers = new ArrayList<>();
        // Bulk Operation : Collection Type
         numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(numbers);





    }

}
