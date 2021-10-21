package Hangman;
import java.util.Random;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        final String[] word = new String[] {"java", "kotlin", "python", "javascript"};
        Random random = new Random();
        int index = random.nextInt(word.length);
        String randomWord = word[index];
        char[] typo = randomWord.toCharArray();
        for (int i = 2; i < typo.length; i++) {
            typo[i] = '-';
        }
        String s = String.valueOf(typo);
        System.out.print("...HANGMAN...\n" +
                "Guess the word " + s + ": ");
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        if (randomWord.equals(user)) {
            System.out.println("You survive!");
        } else {
            System.out.println("You lost!");
        }
    }
}
