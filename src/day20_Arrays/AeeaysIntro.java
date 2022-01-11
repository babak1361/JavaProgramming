package day20_Arrays;

public class AeeaysIntro {
    public static void main(String[] args) {
        String[] months = {"jan", "feb", "march", "April", "may", "jun", "july", "Aguste", "october", "november", "Des"};
        int num = 15;
        if(num < 1 || num >=12){
            System.out.println("not valid number");
            System.exit(0);

        }
        System.out.println(months[num-1]);

    }
}