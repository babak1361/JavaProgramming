package day32_Connstructors;

public class ItemObject {
    public static void main(String[] args) {
        Item item1 =new Item("Bob");
        Item item2 =new Item("Jim",5.54);
        Item item3 = new Item("Mike",6.5,14);

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);



    }
}
