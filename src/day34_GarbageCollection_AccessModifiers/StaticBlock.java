package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {


    public static void main(String[] args) {

        System.out.println("Main Method");

    }

    static { // it is a first runs and only runs one times
        System.out.println("Static Block1");

    }
    static { // it is a first runs and only runs one times
        System.out.println("Static Block2");

    }
    static { // it is a first runs and only runs one times
        System.out.println("Static Block3");

    }
}
