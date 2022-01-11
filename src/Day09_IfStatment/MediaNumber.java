package Day09_IfStatment;

public class MediaNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;
        /* if we have three different number,
        one must be maximum,
        one must be median number and one must be minimum number
         */
      boolean aIsMedian = (a > b && a < c) || (a > c && a < b );
      boolean bIsMedian = (b < c && b > a) || ( b > c && b < a);
      boolean cIsMedian = !aIsMedian && !bIsMedian;
      /*

         in order for a to be the median number:
      1. if c is the maximum number & b is the minimum number, then a is the median number
      2. if b is the maximum number & c is the minimum number, then a is the median number
             */


        if (aIsMedian){ // if a is a median number
            System.out.println(a + " is a Median number");
        }
         if(bIsMedian){// if b is a median number
             System.out.println(b + " is a Median number");
         }
         if(cIsMedian){// if c is a median number
             System.out.println(c + " is a Median number");
         }

    }
}
   /* Create a class called MedianNumber.
   write a program that can find the median number
   between three DIFFERENT given integers

        Ex:
        a = 10, b= 15, c = 20;

        Output:
        15 is the median number


          Posibility#1 = a could be a median number
          Posibility#2 = b could be a median number
          Posibility#3 = c could be a median number

    */