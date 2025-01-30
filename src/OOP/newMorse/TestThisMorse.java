package OOP.newMorse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestThisMorse {
    MorseTranslator morseTranslator = new MorseTranslator();
    @Test
    public void testMorseTranslator(){
        Assert.assertEquals("A",morseTranslator.morseToText(".-"));
        Assert.assertNotEquals("A",morseTranslator.morseToText("-..."));
    }
    @Test
    public void testTextTranslator(){
        Assert.assertEquals(".-",morseTranslator.textToMorse("A"));
        Assert.assertNotEquals(".-",morseTranslator.textToMorse("B"));
    }
    @Test
    public void testExceptions(){
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            morseTranslator.textToMorse("hello123");
        });
    }


}
