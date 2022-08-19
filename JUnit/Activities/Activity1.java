package activities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Activity1 {
    // Test fixtures
    static ArrayList<String> list;

    @BeforeAll
    static public void setUp()
    {
        list = new ArrayList<String>();
        list.add("alpha");
        list.add("beta");
    }
    @Test
    public void insertTest()
    {
        assertEquals(2,list.size(),"size is wrong");
        list.add("test");
        assertEquals(3,list.size(),"size is wrong");
        assertEquals("alpha",list.get(0),"wrong name match");
        assertEquals("beta",list.get(1),"wrong name match");
        assertEquals("test",list.get(2),"wrong name match");
    }
    @Test
    public void replaceTest()
    {
        assertEquals(2,list.size(),"size is wrong");
        list.add("test");
        assertEquals(3,list.size(),"size is wrong");
        list.set(1, "Henry");
        assertEquals(3,list.size(),"size is wrong");
        assertEquals("alpha",list.get(0),"wrong name match");
        assertEquals("Henry",list.get(1),"wrong name match");
        assertEquals("test",list.get(2),"wrong name match");

    }

}
