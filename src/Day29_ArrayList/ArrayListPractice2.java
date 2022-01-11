package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees =new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","David","Jimmy","Daniel","Aaron","Ahmad","David","Shay","Ahmad"));

        employees.retainAll(Arrays.asList("Ahmad","David"));
        System.out.println("employees = " + employees);
        System.out.println("_______________________________________");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>( Arrays.asList(names) );

        list.removeIf( p -> p.charAt(0) == 'M' );

        names = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));





    }
}
