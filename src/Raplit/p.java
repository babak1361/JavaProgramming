package Raplit;

public class p {

    public static void main(String[] args){
        helloWord7Times();
        HelloCydeo6Times();
        HelloBabak10Times();


        agePerson(1982);
        ifOddNumberOrEvenNumber(12);
        nameOfTheMonth(15);


    }
   public static void helloWord7Times(){
       for (int i = 0; i < 7; i++) {
           System.out.println("Hello Word");
       }
   }

   public static void HelloCydeo6Times(){
       for (int i = 0; i < 6; i++) {
           System.out.println("Hello Cydeo!");
       }
   }

   public static void HelloBabak10Times(){
       for (int i = 0; i < 10; i++) {
           System.out.println("Hello Babak");
       }
   }

   public static void ifOddNumberOrEvenNumber(int number){
        if(number %2 == 0){
           System.out.println("is Even Number!");
       }else {
            System.out.println("is Odd Number!");
        }
   }

   public static void agePerson(int birthyear){
        int age = 2021 - birthyear;
       System.out.println("you are " + age + "years old!");



   }

   public static void nameOfTheMonth(int month){
        if( month < 0 || month>12){
            System.out.println("Invalid Month");
            System.exit(0);
        }
        String months= (month==1)?"Jan":(month==2)?"Feb":(month==3)?"march":
               (month==4)?"April":(month==5)?"May":(month==6)?"Jun":(month==7)?"July":
                       (month==8)?"Ageust":(month==9)?"Sep":(month==10)?"Oct":(month==11)?"Nov":"Des";
       System.out.println(" name of the months = " + months);
   }

}

