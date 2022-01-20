package Hangman;
import java.util.Scanner;
import java.util.Random;

class Hangman {
    public static void main(String[] args) {
        String[] words = {"java", "kotlin", "python", "javascript"};
        Random randomIntGen = new Random();
        int randomInt = randomIntGen.nextInt(words.length);
        String word = words[randomInt];
        System.out.println("HANGMAN \nGuess the word:");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if (answer.equals(word)) {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}