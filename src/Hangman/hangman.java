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
                letters.add(user);
                attempt--;
                if (randomWord.contains(user)) {
                    for (int i = 0; i < randomWord.length(); i++) {
                        if (hypo[i] == user.charAt(0)) {
                            s.setCharAt(i, user.charAt(0));
                        }
                    }
                    if (s.toString().equals(randomWord)) {
                        System.out.println("Thanks for playing!\n" +
                                "We'll see how well you did in the next stage");
                        boolTrue = false;
                    }
                } else {
                    System.out.println("That letter doesn't appear in the word");
                }
            } else {
                System.out.println("Thanks for playing!\n" +
                        "We'll see how well you did in the next stage");
                boolTrue = false;
            }
        }
    }
}
