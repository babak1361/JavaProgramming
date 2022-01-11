package Raplit;


import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String [] city={"Shiraz","Esfahan","Tehran"};
        String[] result=new String[city.length];
        int j=0;
        for (int i = result.length - 1; i >= 0; i--,j++) {
            result[j]=city[i];
        }
        System.out.println(Arrays.toString(result));
        System.out.println("______________________________________");

        ArrayList<Integer> number=new ArrayList<>();
        number.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> riversNumber=new ArrayList<>();

        for (int i = number.size() - 1; i >= 0; i--) {
            int each=number.get(i);
            riversNumber.add(each);
        }
        System.out.println(riversNumber);
    }
    }

