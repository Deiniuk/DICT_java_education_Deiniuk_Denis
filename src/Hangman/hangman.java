package Hangman;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        String word = "java";
        System.out.print("HANGMAN\n" +
                "The game will be available soon.\n" +
                "Guess the word: ");
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        if (word.equals(user)) {
            System.out.println("You survive!");
        } else {
            System.out.println("You lost!");
        }
    }
}
