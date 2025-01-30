package OOP.newMorse;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {
    // Skapa en uppsättning av morse-koder och bokstäver
    private Map<Character, String> letterToMorse;
    private Map<String, Character> morseToLetter;

    // Konstruktor som initierar kartorna
    public MorseTranslator() {
        letterToMorse = new HashMap<>();
        morseToLetter = new HashMap<>();

        String[] morseAlphabet = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",  // A-Z

        };

        char letter = 'A';
        for (String code : morseAlphabet) {
            if (letter <= 'Z') {
                letterToMorse.put(letter, code);
                morseToLetter.put(code, letter);
                letter++;
            }
        }


    }

    // Metod för att översätta text till morse
    public String textToMorse(String text) {
        StringBuilder morseCode = new StringBuilder();
        try {
            for (char c : text.toUpperCase().toCharArray()) {
                if (letterToMorse.containsKey(c)) {
                    morseCode.append(letterToMorse.get(c)).append(" ");
                } else if (c == ' ') {
                    morseCode.append("  "); // Två mellanslag för att separera ord
                } else {
                    throw new IllegalArgumentException("kan ej översätta: "+ c);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Fel, " + e.getMessage());
            throw e;


        }
        return morseCode.toString().trim();
    }

    // Metod för att översätta morse till text


    public String morseToText(String morse) {
        StringBuilder text = new StringBuilder();

        try {

            String[] morseWords = morse.split("  "); // Dela på ord (två mellanslag)
            for (String word : morseWords) {
                String[] morseLetters = word.split(" ");
                for (String letter : morseLetters) {
                    if (morseToLetter.containsKey(letter)) {
                        text.append(morseToLetter.get(letter));
                    } else {
                        throw new IllegalArgumentException("Ogiltig morsekod: " + letter);
                    }
                }
                text.append(" ");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Fel: " + e.getMessage());

        }

        return text.toString().trim();
    }
//                    throw new IllegalArgumentException("Ogiltig morsekod" + letter);
//                }
//            }
//            text.append(" ");
//        }catch(IllegalArgumentException e){
//        System.out.println("Fel: " + e.getMessage);
//        return null;
//    }
//
//        return text.toString().trim();

}
