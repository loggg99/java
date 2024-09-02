package Practice;

import java.util.*;


public class list {

    public static void exam1() {
        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("orange");

        list.add(1,"grape");

        System.out.println("List size : " + list.size());




    }




    public static void main(String[] args) {
        exam1();

    }
}
