package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args)
    {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");

        for(String s : myList)
        {
            System.out.println(s);
        }
        System.out.println("3rd item in the list :"+myList.get(2));
        if(myList.contains("C"))
        {
            System.out.println("C exists in the list");
        }
        System.out.println("Size of the list"+myList.size());
        System.out.println(myList.remove("D"));
        System.out.println("Size of the list after removing D :"+myList.size());
    }
}
