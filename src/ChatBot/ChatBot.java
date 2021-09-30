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
        System.out.println("What a great name you have, " + user + "!\nLet me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5 and 7.");
        Scanner scan1 = new Scanner(System.in);
        int remainder3 = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        int remainder5 = scan2.nextInt();
        Scanner scan3 = new Scanner(System.in);
        int remainder7 = scan3.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + " that`s a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        Scanner scan4 = new Scanner(System.in);
        int number = scan4.nextInt();
        for (int i=0; i <= number; i++) {
            System.out.println(i + "!");
        }
    }
}
