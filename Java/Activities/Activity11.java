package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args)
    {
        Map<Integer,String> colours = new HashMap<>();
        colours.put(1,"purple");
        colours.put(2,"black");
        colours.put(3,"blue");
        colours.put(4,"green");
        colours.put(5,"yellow");

        System.out.println("Map data:"+colours);
        colours.remove(2);
        System.out.println("After removing black colour from the map:"+colours);
        if(colours.containsValue("black"))
            System.out.println("Value exists");
        else
            System.out.println("value does not exist");
        System.out.println("Size of the map is :"+colours.size());
    }
}
