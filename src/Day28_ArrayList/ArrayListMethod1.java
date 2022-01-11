package Day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);//it is one ellement
        numbers.add(20);//1
        numbers.add(30);// index 2
        numbers.add(40);// index 3
        numbers.add(50);// 4
        numbers.add(60);//5

        numbers.add(2,25);// we add(insert) element to index 2
        numbers.add(5,45);// "    "   "      "   "   5
        System.out.println(numbers);

        System.out.println(numbers.size());
        int lastIndex = numbers.size()-1;// way to find the last index number of Array

        System.out.println("lastIndex = " + lastIndex);

     Integer num =numbers.get(3);
        System.out.println(num);

        System.out.println("_________________________________");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("____________________");
        ArrayList<String> list =new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("c#");
        list.add("Ruby");
        list.add("Java");

        list.set(2,"JavaScrip");//replace the element with given index to new element
        list.set(3,"C++");
        System.out.println(list);
        System.out.println("______________________________________");

        ArrayList<String> employees = new ArrayList<>();
        employees.add("sat");
        employees.add("Ayda");
        employees.add("Oldi");
        employees.add("Nero");
        employees.add("Ali");
        employees.add("babak");
        employees.add("zaya");

        System.out.println(employees);

        employees.remove(0);// remove index number that given
        System.out.println(employees);
        employees.remove(0);// again remove the current 0 index number
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(1);// by using index 1 we are going to remove the element in index 1
        System.out.println(employees);

        employees.remove(employees.size()-1);// way to remove the last elements
        System.out.println(employees);

        System.out.println("_____________________________");


        boolean r1 = employees.remove("baba");// remove the element by object if it is true
        System.out.println(employees);

       boolean r2 = employees.remove("Nero");//if true it is going to remove
        System.out.println(employees);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);








    }
}
