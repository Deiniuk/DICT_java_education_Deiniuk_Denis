package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        String name = "Amogus";
        int year = 2020;
        System.out.println("Hello! My name is " + name + ".\n" +
                "I was created in " + year + ".\n" + "Please, remind me your name.");

        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        System.out.println("What a great name you have, " + user + "!");
    }
}