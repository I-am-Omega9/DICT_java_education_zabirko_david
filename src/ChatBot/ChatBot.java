package ChatBot;

import java.util.Scanner;

public class ChatBot {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        greetings();
        name();
        age();
        count();
        test();
        end();
    }
    static void greetings() {
        System.out.println("Hi! My name is 'The expelled one'!");
        System.out.println("I was created in 2021.");
    }
    static void name()
    {
        System.out.println("Please, remind me your name.");
        String name = scanner.nextLine();
        System.out.printf("What a great name you have, %s", name);
        System.out.print("!");
    }
    static void age()
    {
        System.out.println("\nLet me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3*70+rem5*21+rem7*15) % 105;
        System.out.println("Your age is " + age + ". that's a good time to start programming!");
    }
    static void count()
    {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++)
        {
            System.out.printf("%d!\n", i);
        }
    }
    static void test()
    {   System.out.println("Let's check how well you know about S.T.A.L.K.E.R.");
        System.out.println("The question is quite simple - which stalker group is the best?\n");
        System.out.println("""
                1. The bandits are the best. Have you ever heard the music playing in their camp?
                2. Are you serious? .. I was expecting some interesting programming questions..
                3. Duty will always be the best group because they protect people and the world..
                4. To interrupt the execution of a program.
                """);
        while (true)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("");
            int num = Integer.parseInt(in.next());

            if (num == 2)
            {
                break;
            }
            else System.out.println("Please, try again.");
        }
    }
    static void end()
    {
        System.out.println("Congratulations, have a nice day!");
    }
}