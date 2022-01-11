package day31_Constructors;

public class MovieObject {
    public static void main(String[] args) {

        Movie movie1 =new Movie("USA","Journy to SDET : Cydeo Batch 23","History , comedy ","April 2021","Kuzzat");

        movie1.addCast("Asiya");
        String[] arr ={"Ali","Sam","Bob"};
        System.out.println(arr);
        System.out.println("movie1 = " + movie1);

    }
}
