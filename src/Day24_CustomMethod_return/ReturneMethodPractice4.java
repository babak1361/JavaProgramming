package Day24_CustomMethod_return;

public class ReturneMethodPractice4 {


    public static void main(String[] args) {
        String str ="cccccccddddddaaaaaabbbbbb";

       str= removeDuplicates(str);

        System.out.println(str);



    }
    public static String removeDuplicates(String str){//"aaaabbccc ===>abc
        String result ="";
        for (int i = 0; i < str.length(); i++) {
            char each =str.charAt(i);

            if(!result.contains(""+each)){
                result += each;
            }

        }

        return result;
    }

}
