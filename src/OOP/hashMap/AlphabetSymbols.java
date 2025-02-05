package OOP.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlphabetSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


    }
    private static final Map<String, Character> alphabetToSymbols = new HashMap<>();

    static {
        alphabetToSymbols.put("A", '!');
        alphabetToSymbols.put("B", '?');
        alphabetToSymbols.put("C", '+');
        alphabetToSymbols.put("D", '#');
        alphabetToSymbols.put("E", '¤');
        alphabetToSymbols.put("F", '%');
        alphabetToSymbols.put("G", '&');
        alphabetToSymbols.put("H", '/');
        alphabetToSymbols.put("I", '(');
        alphabetToSymbols.put("J", ')');
        alphabetToSymbols.put("K", '=');
        alphabetToSymbols.put("L", '@');
        alphabetToSymbols.put("M", '£');
        alphabetToSymbols.put("N", '$');
        alphabetToSymbols.put("O", '{');
        alphabetToSymbols.put("P", '[');
        alphabetToSymbols.put("Q", ']');
        alphabetToSymbols.put("R", '}');
        alphabetToSymbols.put("S", '^');
        alphabetToSymbols.put("T", '¨');
        alphabetToSymbols.put("U", '~');
        alphabetToSymbols.put("V", '<');
        alphabetToSymbols.put("W", '>');
        alphabetToSymbols.put("X", '|');
        alphabetToSymbols.put("Y", ';');
        alphabetToSymbols.put("Z", ':');

    }
    public static String translateMorseToText(String alphabetCode) {
        StringBuilder result = new StringBuilder();

        // Dela upp morsekoden vid varje mellanslag eller "/"
        String[] symbolWords = alphabetCode.split("/");

        for (String word : symbolWords) {
            String[] morseChars = word.trim().split(" ");

            for (String morseChar : morseChars) {
                // Hitta motsvarande bokstav i HashMap och lägg till den i resultatet
                Character letter = alphabetToSymbols.get(morseChar);
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
}
