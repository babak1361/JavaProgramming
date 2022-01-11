package Day11_Swich_Scanner;

public class Grade {
    public static void main(String[] args) {

        char grade = 'D';
        String result = "";

        switch (grade) {
            case 'A':
                result = "excellent";
                break;
            case 'B':
                result = "Great Job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
            default:
        }
                System.out.println("Invalid");




    }
}
