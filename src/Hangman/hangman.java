package Hangman;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class hangman {
    public static void main(String[] args) {
        final String[] word = new String[] {"java", "kotlin", "python", "javascript"};
        ArrayList<String> letters = new ArrayList<>();
        Random random = new Random();
        String randomWord = word[random.nextInt(word.length)];
        char[] hypo = randomWord.toCharArray();
        StringBuffer s = new StringBuffer(randomWord);
        for (int i = 0; i < hypo.length; i++) {
            s.setCharAt(i, '-');
        }
        System.out.print("...HANGMAN...\n");
        Scanner scan = new Scanner(System.in);
        boolean boolTrue = true;
        short attempt = 8;
        while (boolTrue) {
            if (attempt > 0) {
                System.out.print("\n" + s + "\nInput a letter:");
                String user = scan.nextLine();
                if (!user.matches("[a-z?]") | user.length() > 1) {
                    if (!user.matches("[a-z?]") & !(user.length() > 1)) {
                        System.out.println("Please enter a lowercase English letter");
                    } else {
                        System.out.println("You should input a single letter");
                    }
                } else {
                    if (randomWord.contains(user)) {
                        if (letters.contains(user)) {
                            System.out.println("You've already guessed this letter");
                        } else {
                            for (int i = 0; i < randomWord.length(); i++) {
                                if (hypo[i] == user.charAt(0)) {
                                    s.setCharAt(i, user.charAt(0));
                                }
                            }
                        }
                        if (s.toString().equals(randomWord)) {
                            System.out.println(s + "\nYou guessed the word!\nYou survive!");
                            boolTrue = false;
                        }
                    } else {
                        System.out.println("That letter doesn't appear in the word");
                        attempt--;
                    }
                    letters.add(user);
                }
            } else {
                System.out.println("You lost!");
                boolTrue = false;
            }
        }
    }
}
