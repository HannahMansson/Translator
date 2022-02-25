package Assignment;

import java.util.HashMap;

public class Converter {

    private final HashMap<String, String> morseCode = new HashMap<>();

    public Converter() {
        morseCode.put("A", "*-");
        morseCode.put("*-", "A");

        morseCode.put("B", "-***");
        morseCode.put("-***", "B");

        morseCode.put("C", "-*-*");
        morseCode.put("-*-*", "C");

        morseCode.put("D", "-**");
        morseCode.put("-**", "D");

        morseCode.put("E", "*");
        morseCode.put("*", "E");

        morseCode.put("F", "**-*");
        morseCode.put("**-*", "F");

        morseCode.put("G", "--*");
        morseCode.put("--*", "G");

        morseCode.put("H", "****");
        morseCode.put("****", "H");

        morseCode.put("I", "**");
        morseCode.put("**", "I");

        morseCode.put("J", "*---");
        morseCode.put("*---", "J");

        morseCode.put("K", "-*-");
        morseCode.put("-*-", "K");

        morseCode.put("L", "*-**");
        morseCode.put("*-**", "L");

        morseCode.put("M", "--");
        morseCode.put("--", "M");

        morseCode.put("N", "-*");
        morseCode.put("-*", "N");

        morseCode.put("O", "---");
        morseCode.put("---", "O");

        morseCode.put("P", "*--*");
        morseCode.put("*--*", "P");

        morseCode.put("Q", "--*-");
        morseCode.put("--*-", "Q");

        morseCode.put("R", "*-*");
        morseCode.put("*-*", "R");

        morseCode.put("S", "***");
        morseCode.put("***", "S");

        morseCode.put("T", "-");
        morseCode.put("-", "T");

        morseCode.put("U", "**-");
        morseCode.put("**-", "U");

        morseCode.put("V", "***-");
        morseCode.put("***-", "V");

        morseCode.put("W", "*--");
        morseCode.put("*--", "W");

        morseCode.put("X", "-**-");
        morseCode.put("-**-", "X");

        morseCode.put("Y", "-*--");
        morseCode.put("-*--", "Y");

        morseCode.put("Z", "--**");
        morseCode.put("--**", "Z");

        morseCode.put("1", "*----");
        morseCode.put("*----", "1");

        morseCode.put("2", "**---");
        morseCode.put("**---", "2");

        morseCode.put("3", "***--");
        morseCode.put("***--", "3");

        morseCode.put("4", "****-");
        morseCode.put("****-", "4");

        morseCode.put("5", "*****");
        morseCode.put("*****", "5");

        morseCode.put("6", "-****");
        morseCode.put("-****", "6");

        morseCode.put("7", "--***");
        morseCode.put("--***", "7");

        morseCode.put("8", "---**");
        morseCode.put("---**", "8");

        morseCode.put("9", "----*");
        morseCode.put("----*", "9");

        morseCode.put("0", "-----");
        morseCode.put("-----", "0");

        morseCode.put(".", "*-*-*-");
        morseCode.put("*-*-*-", ".");

        morseCode.put(",", "--**--");
        morseCode.put("--**--", ",");

        morseCode.put("?", "**--**");
        morseCode.put("**--**", "?");

    }

    public String convertInput(String m) {
        return morseCode.get(m);
    }

    public String EngToMorse(String s) {
        String myString ="";
        String[] input = s.split("");
        for (int i = 0; i < input.length; i++) {
            myString +=morseCode.get(input[i]);
            if (i != input.length -1){
                myString +=" ";
            }
        }
        return myString;
    }

    public String MorseToEng(String s) {
        String myString ="";
        String[] input = s.split(" ");
        for (int i = 0; i < input.length; i++) {
            myString += morseCode.get(input[i]);
        }
        return myString;
    }
}
