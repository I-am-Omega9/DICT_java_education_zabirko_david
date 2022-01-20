package Hangman;
import java.util.Scanner;

class Hangman {
    public static void main(String[] args) {
        String word = "java";
        System.out.println("HANGMAN \nGuess the word:");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if (answer.equals(word)) {
            System.out.println("You survived!");
        }
        else {
            System.out.println("You lost!");
        }
    }
}