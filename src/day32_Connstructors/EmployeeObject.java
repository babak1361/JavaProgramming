package day32_Connstructors;

public class EmployeeObject {
    public static void main(String[] args) {

       Employee employee1 =new Employee("Aaron");

       Employee employee2 = new Employee("Bob",'F');

       Employee employee3 = new Employee("Jim",'F',"SDET");


       Employee employee4 = new Employee("May",'M',"QA",115000);

        System.out.println(employee4);
        System.out.println(employee2);
        System.out.println(employee1);
        System.out.println(employee3);


    }
}
