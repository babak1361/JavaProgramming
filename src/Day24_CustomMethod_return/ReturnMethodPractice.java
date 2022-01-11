package Day24_CustomMethod_return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
         int maxNumber=maxNumber(100,200);
        System.out.println(maxNumber);

        int multiplication = maxNumber * 2;
        System.out.println("multiplication = " + multiplication);
    }

    public static int maxNumber(int a,int b){
         int result = 0;
         if(a>b){
             result=a;

         }else {
             result=b;
         }
         return result;
    }




}


/*
     find the max number between two 100~200
     multiply the max number by 2
*/
