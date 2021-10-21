package Hangman;
import java.util.Random;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        String[] word = new String[] {"java", "kotlin", "python", "javascript"};
        Random random = new Random();
        int index = random.nextInt(word.length);
        String randomWord = word[index];
        System.out.print("HANGMAN\n" +
                "The game will be available soon.\n" +
                "Guess the word: ");
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        if (randomWord.equals(user)) {
            System.out.println("You survive!");
        } else {
            System.out.println("You lost!");
        }
    }
}
