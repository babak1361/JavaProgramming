package Day11_Swich_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 5;
        String result ="";


        /*
        if(number == 1){
            System.out.println("Monday");
        }
        ....
         */

        //   <=  <= ....

        switch(number) { //1,2,3,4,5,6,7.  ==

            case 1:
               result = "Monday";
                break; // exits the switch after executing the case block

            case 2:
                result = "Tuesday";
                break; // exits the switch after executing the case block

            case 3:
               result = "Wednesday";
                break; // exits the switch after executing the case block

            case 4:
                result = "Thursday";
                break; // exits the switch after executing the case block

            case 5:
               result = "Friday";
                break; // exits the switch after executing the case block

            case 6:
               result = "Saturday";
                break; // exits the switch after executing the case block

            case 7:
               result = "Sunday";
                break; // exits the switch after executing the case block
            default:

        }
        System.out.println(result);

        }
}
