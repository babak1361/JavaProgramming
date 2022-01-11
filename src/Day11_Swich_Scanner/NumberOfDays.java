package Day11_Swich_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int number = 19;
        String result = "";

        if(number<=12 && number>= 1){
            switch (number) {
                case 2://2
                    result = "28 days";
                    break;
                case 4://4,6,9,11
                    result = "30 days";
                    break;
                default:
                    //1,3,5,7,8,10,12
                    result = "31 days";
            }
            }else{

            result = "invalid number";
        }
        System.out.println(result);
    }
}
