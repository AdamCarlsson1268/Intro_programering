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
        Assert.assertEquals(".-", morseTranslator.textToMorse("A"));
        Assert.assertNotEquals(".-", morseTranslator.textToMorse("B"));
    }

    @Test
    public void testExceptions() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            morseTranslator.textToMorse("hello123");
        });
    }

    @Test//testar a
    public void testExceptions2(){
        Assert.assertThrows(IllegalArgumentException.class, ()->{
            morseTranslator.morseToText(".....#");
        });
    }
    @Test
    public void testExceptions3(){
        Assert.assertThrows(IllegalArgumentException.class, ()->{
            morseTranslator.textToMorse("å");
        });

    }
}

//
//// Test 2: Översättning från morse till text
//@Test
//public void testMorseToText() {
//    String morse = ".... . .-.. .-.. ---";
//    String expectedText = "HELLO";
//    String actualText = translator.morseToText(morse);
//    assertEquals(expectedText, actualText, "Morse till text-översättning misslyckades.");
//}
//
//// Test 3: Testa text med mellanslag
//@Test
//public void testTextWithSpace() {
//    String text = "HELLO WORLD";
//    String expectedMorse = ".... . .-.. .-.. ---  .-- --- .-. .-.. -..";
//    String actualMorse = translator.textToMorse(text);
//    assertEquals(expectedMorse, actualMorse, "Text med mellanslag till morse misslyckades.");
//}
//
//// Test 4: Testa morse med mellanslag
//@Test
//public void testMorseWithSpace() {
//    String morse = ".... . .-.. .-.. ---  .-- --- .-. .-.. -..";
//    String expectedText = "HELLO WORLD";
//    String actualText = translator.morseToText(morse);
//    assertEquals(expectedText, actualText, "Morse med mellanslag till text misslyckades.");
//}
//
//// Test 5: Testa ogiltiga tecken i text (ska kasta ett undantag)
//@Test
//public void testInvalidCharacterInText() {
//    String text = "HELLO 123";
//    IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
//        translator.textToMorse(text);
//    });
//    assertEquals("kan ej översätta: 1", thrown.getMessage());
//    assertEquals("kan ej översätta: 2", thrown.getMessage());
//    assertEquals("kan ej översätta: 3", thrown.getMessage());
//}
//
//// Test 6: Testa tom sträng
//@Test
//public void testEmptyString() {
//    String text = "";
//    String expectedMorse = "";
//    String actualMorse = translator.textToMorse(text);
//    assertEquals(expectedMorse, actualMorse, "Tom sträng till morse misslyckades.");
//
//    String morse = "";
//    String expectedText = "";
//    String actualText = translator.morseToText(morse);
//    assertEquals(expectedText, actualText, "Tom sträng till text misslyckades.");
//}
//
//// Test 7: Testa långt ord
//@Test
//public void testLongWord() {
//    String text = "SUPERLONGTEST";
//    String expectedMorse = "... ..- .--. . .-. .-.. --- -. --. - . ... -";
//    String actualMorse = translator.textToMorse(text);
//    assertEquals(expectedMorse, actualMorse, "Långt ord till morse misslyckades.");
//}
//
//// Test 8: Testa flera ord i morse
//@Test
//public void testMultipleWordsInMorse() {
//    String morse = "-- --- .-. ... .  -.-. --- -.. .";
//    String expectedText = "MORSE CODE";
//    String actualText = translator.morseToText(morse);
//    assertEquals(expectedText, actualText, "Morse med flera ord till text misslyckades.");
//}
//}
