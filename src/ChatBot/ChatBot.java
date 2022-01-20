package ChatBot;

import java.util.Scanner;

public class ChatBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greetings();
        name();
        age();
        count();
    }
    static void greetings() {
        System.out.println("Hi! My name is 'The expelled one'!");
        System.out.println("I was created in 2021.");
    }
    static void name() {
        System.out.println("Please, remind me your name.");
        String name = scanner.nextLine();
        System.out.printf("What a great name you have, %s", name);
        System.out.print("!");
    }
    static void age() {
        System.out.println("\nLet me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + ". that's a good time to start programming!");
    }
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }
}