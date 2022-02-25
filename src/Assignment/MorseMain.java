package Assignment;

import java.util.Scanner;

public class MorseMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Converter convert = new Converter();


        System.out.println("Welcome to the morse code translator!");
        System.out.println("Enter M to translate from Morse and enter E to translate from English");
        String choice = scan.nextLine().toUpperCase();


        while (true) {
            if (choice.equals("M")) {
                System.out.println(convert.MorseToEng(scan.nextLine()));
            } else if (choice.equals("E")) {
                System.out.println(convert.EngToMorse(scan.nextLine().toUpperCase()));
            }
        }
    }


}




