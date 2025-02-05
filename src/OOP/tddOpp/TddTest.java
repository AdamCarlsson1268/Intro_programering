package OOP.tddOpp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TddTest {
    @Test
    public void charToInt() {
        ConvertAlphabet convertAlphabet = new ConvertAlphabet();
        assertEquals(1,convertAlphabet.convertFromCharToInt('A'));
        assertEquals(2,convertAlphabet.convertFromCharToInt('B'));
        assertEquals(26,convertAlphabet.convertFromCharToInt('z'));

    }

    @Test
    public void intToChar() {
        ConvertAlphabet convertAlphabet = new ConvertAlphabet();
        assertEquals('a',convertAlphabet.convertIntToChar(1));
        assertEquals('b',convertAlphabet.convertIntToChar(2));
        assertEquals('c',convertAlphabet.convertIntToChar(3));
    }

}
