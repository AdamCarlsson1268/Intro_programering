package OOP.tddOpp;

import java.util.Arrays;

public class ConvertAlphabet {

    private char[] alphabetArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v','w', 'x', 'y', 'z'};

    public int convertFromCharToInt(char charachter) {
        charachter = Character.toLowerCase(charachter);

        for (int i = 0; i < alphabetArray.length; ++i) {
            if (alphabetArray[i] == charachter) {
                return i + 1;

            }
        }
        return -1;

    }


    public char convertIntToChar(int i) {
        if (i >= 1 && i <= 26) {
            return alphabetArray[i - 1];
        } else {
            throw new IllegalArgumentException("Endast tal mellan 1-26, tack!");
        }
    }


}



