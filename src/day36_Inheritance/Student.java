package day36_Inheritance;

public class Student {
    private String name;
    private int age;
    private char gender,grade;
    private String schoolName;

    public static boolean isStudent = true;
    public static boolean isHuman = true;

    public Student(String name, int age, char gender, char grade, String schoolName) {
     setName(name);
     setAge(age);
     setGender(gender);
     setGrade(grade);
     setSchoolName(schoolName);
    }


    // getter and setter always create with public class and shod be match with own instance data type.

    public String getName(){// ganarat getter for the name
        return name;
    }

    public int getAge(){
        return age;
    }

   public  void setName(String name){// way to create the setter and shoud be match with instance date type
        this.name= name;
   }

    public void setAge(int age){
        if( age < 5 || age > 90){ // exits the method
            return;
        }
        this.age=age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender == 'M' || gender == 'F')){// if not M or F exits the method
            return;
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(!(grade == 'A' || grade == 'B' || grade == 'C' || grade=='D'|| grade =='F')){
            return;
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    public void Study(){
        System.out.println(name + " is study");
    }


}
    /*
    Create a class named Student:
            private variables:
       name, age, gender, grade, schoolName

   Encapsulate all the fields (at least encapsulate two fields manually)
   Requirements:
  1. age should not be set less than 5 or greater than 90
  2. gender should not be set to any character other than: 'M' and 'F'
  3. grade should not be set to any characters other than: 'A', 'B', 'C', 'D', and 'F'

    Add a constructor that can set all teh fields when the object is created
         (requirements of fields in the above must be applied)


      Methods:
           study()
           toString()

           we need to understand what is diffrant between setter and getter and what the resion to create them and how
     */

