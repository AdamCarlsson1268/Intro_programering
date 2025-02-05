package OOP.namesList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class TestNamesList {
    private Namelist namelist;
    @BeforeEach
    void setUp(){
        namelist = new Namelist();
    }
    @Test
    public void testAddNames(){
        namelist.addName("Adam");
        namelist.addName("Emma");

        List<String> names = namelist.getNames();
        assertEquals(2,names.size());
        assertEquals("Adam",names.get(0));
        assertEquals("Emma",names.get(1));
    }
    @Test
    public void testStopAddingNames(){
        namelist.addName("Adam");
        namelist.addName("stop");

        List<String> names = namelist.getNames();
        assertEquals(1,names.size());
        assertEquals("Adam",names.get(0));

    }
    @Test
    public void testOverwriteFirstName(){
        namelist.addName("Adam");
        namelist.addName("Emma");

        namelist.overwriteFirstName("Lovelia");

        List<String> names = namelist.getNames();
        assertEquals(2, names.size());
        assertEquals("Lovelia", names.get(0));
        assertEquals("Emma", names.get(1));
    }
}
