package OfficeHours.CustomClass;

public class CustomClassIntro {


/* CustomClassIntro

            What is Class?

                - Template/ Blueprint for Object
                - We can create class without Object and we can not creat object without class
                            Arrays.toString();

        */

    public String instanceVariable;   // null

     /*
            What is instanceVariable?

                - it is BELONGS to OBJECT
                - it should be created in class but outside any type of method
                - They are attributes of Objects
                - initilization is not mandatory
                - we can access via Objects

                        Car c = new Car();
                            c.instanceVariable="";
                - They can have some access modifier.We are using only public for now
         */

    public static String staticVariable="it is initlized when class loading";

/*
            What is staticVariable?

                -it is  BELONGS to the CLASS
                - Can be used to refer common of all OBJECTS
                - Gets memory ONLY ONCE ADVANTAGE
                - we can access via ClassName.staticVariable  // more professional
                - if we change value staticVariable it will AFFECT all Objects
                            Car c=new Car();
                            Car.staticVariable="BMW";

                            Car c1=new Car();
                            Car.staticVariable="Ford";
                 - Initilization is not Mandatory


        */
        public void setInfo(String instanceVariable){
            // To set Object attributes
            this.instanceVariable=instanceVariable;

        }


        public void instanceMethod(){
            /*
            What is instanceMethod?

            - Instance method can access instance variables/methods ALSO it can access static variables and methods
*/

            System.out.println("Instance method is Running");
            staticVariable="Static Variable From Instance Method";
            staticMethod();
            instanceVariable="Instance Variable From Instance Method";

            String localVariable="Local Variable From Instance Method";
            System.out.println("localVariable = " + localVariable);

          /*
           What is localVariable?

                        - BELONGS METHOD
                        - Defined inside Method
                        - Exist only related Method
                        - We can not use access modifier for local variables
             */


        }

            public static void staticMethod() {
                System.out.println("Static Method is running");
                staticVariable="Static Variable From Static MEthod";
                // instanceVariable;   Compiler ERROR
               //  instanceMethod();
                /*
                What is static variable?

                - We can call it via ClassName.staticMethod
                - We can not use instance variable/methods

                 */
        }


public String toString() {
    return "CustomClassIntro{" +
            "instanceVariable='" + instanceVariable +
    ", staticVariable='" + staticVariable +
    '}';


    // to get info about OBJECT
}   }