package OOP.newMorse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestThisMorse {
    MorseTranslator morseTranslator = new MorseTranslator();

    @Test
    public void testMorseTranslator() {
        Assert.assertEquals("A", morseTranslator.morseToText(".-"));
        Assert.assertNotEquals("A", morseTranslator.morseToText("-..."));
    }

    @Test
    public void testTextTranslator() {
        Assert.assertEquals(".", morseTranslator.textToMorse("E"));
        Assert.assertNotEquals(".-", morseTranslator.textToMorse("B"));
    }


    @Test
    public void testExceptions() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            morseTranslator.textToMorse("hello123");
        });
    }

    @Test
    public void testExceptions2(){
        Assert.assertThrows(IllegalArgumentException.class, ()->{
            morseTranslator.morseToText("....-");
        });
    }
    @Test
    public void testExceptions3(){
        Assert.assertThrows(IllegalArgumentException.class, ()->{
            morseTranslator.textToMorse("å");
        });

    }
    @Test
    public void testWithoutInput(){
        String result1 = morseTranslator.textToMorse("");
        Assert.assertEquals("",result1);
      String result2 = morseTranslator.morseToText("");
        Assert.assertEquals("",result2);
    }
}


