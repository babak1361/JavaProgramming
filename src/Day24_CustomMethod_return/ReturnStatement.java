package Day24_CustomMethod_return;

public class ReturnStatement {



       public static void nameOfDay(int Number){
        if(Number < 1|| Number>7){
            System.out.println("Invalid");
            return;// return it is just for exiting the method
                   // break is for exiting the Loop

        }
        if(Number == 1){
            System.out.println("Monday");
        }else if (Number == 2){
            System.out.println("Tusdey");
        }else if(Number==3){
            System.out.println("Wednesday");
        }else if(Number==4){
            System.out.println("Thursday");
        }else if(Number==5){
            System.out.println("Friday");
        }else if(Number==6){
            System.out.println("Saturday");

        }else {
            System.out.println("sunday");
        }

    }
    public static void main(String[] args) {
        nameOfDay(10);


    }
}
