package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Toyota", "Camry", "White", 2021, 35000);

        System.out.println(car1);


        Car car2 = new Car();
        car2.setInfo("Honda", "Accord", "Black", 2014, 12800);
        System.out.println(car2);


        Car car3 = new Car();
        car3.setInfo("Mazda", "3", "White", 2018, 14500);
        System.out.println(car3);

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3));

        for (Car each : carsList) {
            System.out.println(each.brand + " : " + each.price);
        }

        System.out.println("______________________________________");

        /*
        BMw: 2005~2008 eligibale for recall
        Toyota : 1995 ~ 1997
         */

        // p is variable for each car object
        carsList.removeIf( p -> p.brand.equals("BMW") && p.year >=2005 && p.year <= 2008);
        carsList.removeIf(p-> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);




    }
}
