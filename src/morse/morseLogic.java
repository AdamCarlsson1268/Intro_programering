package morse;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Objects;


public final class morseLogic {
    // Skapa en HashMap som mappar morsekod till bokstäver
    private static final Map<String, Character> morseToCharMap = new HashMap<>();

    static {
        morseToCharMap.put(".-", 'A');
        morseToCharMap.put("-...", 'B');
        morseToCharMap.put("-.-.", 'C');
        morseToCharMap.put("-..", 'D');
        morseToCharMap.put(".", 'E');
        morseToCharMap.put("..-.", 'F');
        morseToCharMap.put("--.", 'G');
        morseToCharMap.put("....", 'H');
        morseToCharMap.put("..", 'I');
        morseToCharMap.put(".---", 'J');
        morseToCharMap.put("-.-", 'K');
        morseToCharMap.put(".-..", 'L');
        morseToCharMap.put("--", 'M');
        morseToCharMap.put("-.", 'N');
        morseToCharMap.put("---", 'O');
        morseToCharMap.put(".--.", 'P');
        morseToCharMap.put("--.-", 'Q');
        morseToCharMap.put(".-.", 'R');
        morseToCharMap.put("...", 'S');
        morseToCharMap.put("-", 'T');
        morseToCharMap.put("..-", 'U');
        morseToCharMap.put("...-", 'V');
        morseToCharMap.put(".--", 'W');
        morseToCharMap.put("-..-", 'X');
        morseToCharMap.put("-.--", 'Y');
        morseToCharMap.put("--..", 'Z');

    }

    // Metod för att översätta morsekod till text
    public static String translateMorseToText(String morseCode) {
        StringBuilder result = new StringBuilder();

        // Dela upp morsekoden vid varje mellanslag eller "/"
        String[] morseWords = morseCode.split("/");

        for (String word : morseWords) {
            String[] morseChars = word.trim().split(" ");

            for (String morseChar : morseChars) {
                // Hitta motsvarande bokstav i HashMap och lägg till den i resultatet
                Character letter = morseToCharMap.get(morseChar);
                if (letter != null) {
                    result.append(letter);
                } else {
                    result.append('?'); // Om morsekoden är ogiltig
                }
            }
            result.append(' '); // Lägg till ett mellanslag mellan ord
        }

        return result.toString().trim();
    }

    public static String getKeyByValue(Character value) {
        for (Map.Entry<String, Character> entry : morseToCharMap.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;

    }

    public static String translateTextToMorse(String text) {
        StringBuilder result = new StringBuilder();

        // Dela upp morsekoden vid varje mellanslag eller "/"
        String[] textWords = text.split(" ");
        int index = 0;

        for (String word : textWords) {
            char[] wordChars = word.toCharArray();

            for (char textChar : wordChars) {
                // Hitta motsvarande bokstav i HashMap och lägg till den i resultatet
                Character letter = Character.toUpperCase(textChar);
                String morseCode = getKeyByValue(letter);
                if (morseCode != null) {
                    result.append(morseCode);
                } else {
                    result.append('?'); // Om morsekoden är ogiltig
                }
                result.append(' '); // Lägg till ett mellanslag mellan bokstav
            }
            if (index < textWords.length - 1) {
                result.append("/ ");// Lägg till ett mellanslag mellan ord
            }
            index++;
        }

        return result.toString().trim();
    }

    public static String translateInput(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "Vänligen skriv något, det är tomt :) ";
        }
        try {
            String translatedText = translateMorseToText(input);
            if (!translatedText.contains("?")) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException exception) {
            return "fel, du måste använda morsebokstäver (Morse till text";
        }
        try {
            String translatedMorse = translateTextToMorse(input);
            if (!translatedMorse.contains("?")) {
                throw new InputMismatchException();
            }
        } catch (
                InputMismatchException exception) {
            return "fel, du måste använda bokstäver (Text till morse) " ;
        }


            return STR."kan ej översätta: \{input}";
        }
}


