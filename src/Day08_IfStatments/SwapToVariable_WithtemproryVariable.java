package Day08_IfStatments;

public class SwapToVariable_WithtemproryVariable {
    public static void main(String[] args) {
          int a = 10;
          int b = 15 ;
          //-------------------------
       int c = b; // c = 15 this is temperory variable
       b = a; // b=10
        a = c;

        //--------------------------
        System.out.println("a = " + a); // 15
        System.out.println("b = " + b); // 10

    }
}
/*
write a program that can swipe two variables' value by using a temporary variable

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10

 */