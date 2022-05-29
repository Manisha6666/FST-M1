package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
    public static void main(String[] args)
    {
        Set<Object> hs = new HashSet<>();
        hs.add("Ram");
        hs.add(1);
        hs.add(20);
        hs.add("Sita");
        hs.add(true);
        hs.add(2.45);

        System.out.println("Size of the hashset : "+hs.size());
        System.out.println("Removing 2.45 from the hashset : "+hs.remove(2.45));
        System.out.println("Removing Sam from the hashset  which does not exist: "+hs.remove("Sam"));
        if(hs.contains("Ram"))
            System.out.println("Ram exists in the set");
        for(Object o : hs)
        {
            System.out.println("Objects in the set" +o);
        }
    }

}
