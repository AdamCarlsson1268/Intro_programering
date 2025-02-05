package OOP.hashMap;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestNamesAge {
    @Test
    public void testNamesAge(){
        NamesAge namesAge = new NamesAge();
        Assert.assertEquals(29,namesAge.getAge("Adam"));
    }
}
