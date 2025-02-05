package morse;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class morseTest {
    @Test
    public void testTranslateMorseToText(){

        Assert.assertEquals("A",morseLogic.translateMorseToText(".-"));
        Assert.assertNotEquals("B",morseLogic.translateMorseToText(".-"));
    }

    @Test
    public void testTranslateTextToMorse(){
        Assert.assertEquals(".-",morseLogic.translateTextToMorse("A"));
        Assert.assertNotEquals("-...",morseLogic.translateTextToMorse("A"));
    }
    @Test
    public void testTranslateInput(){
        Assert.assertTrue(morseLogic.translateInput("123").contains("kan ej"));
        Assert.assertFalse(morseLogic.translateInput("ABC").contains("kan ej"));
    }
    @Test
    public void testGetKeyByValue(){
        Assert.assertEquals(".-",morseLogic.getKeyByValue('A'));
        Assert.assertNotEquals(".-",morseLogic.getKeyByValue('B'));
    }
}
