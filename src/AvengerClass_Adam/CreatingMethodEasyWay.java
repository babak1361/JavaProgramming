package AvengerClass_Adam;

public class CreatingMethodEasyWay {
    public static void main(String[] args) {

       int result1 = add(4,2);
       int result2= subtract(4,2);
       int result3 = divide(4,4);
      int result4= multply(3,4);

        System.out.println();
      //  System.out.println(subtract(4,2));
       // System.out.println(multiply(4,2));
       // System.out.println(divide(4,2));


    }

    private static int multply(int i, int i1) {
        return i*i1;
    }

    private static int divide(int i, int i1) {
        return i/i1;
    }

    private static int subtract(int i, int i1) {
        return i-i1;
    }

    private static int add(int i, int i1) {
        return i+i1;
    }


}
/*
       - Implementation of add, subtract, multiply and divide methods in Calculator class
       - add(4,2) return 6
       - subtract(4,2) return 2
       - multiply(4,2) return 8
       - divide(4,2) return 2

 */