package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hi! My name is 'The expelled one'!");
        System.out.println("I was created in 2021.");
        System.out.println("Please, remind me your name.");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.printf("What a great name you have, %s", name);
        System.out.print("!");
        in.close();
    }
}