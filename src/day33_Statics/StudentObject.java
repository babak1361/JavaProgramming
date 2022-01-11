package day33_Statics;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {

Student student1= new Student("Bob");
Student student2= new Student("Babak",'F');
Student student3= new Student("Jim",123);
Student student4= new Student("Mick",125,'A');
Student student5= new Student("Mert",'M',28);
Student student6= new Student("Suh",'F',27,15);
Student student7= new Student("Ali",'M',42,546,'C');

        System.out.println(student1 == student2);


     Student[] students={student1, student2, student3, student4, student5, student6, student7};

        System.out.println(Arrays.toString(students));



    }
}
