package Hangman;
import java.util.Scanner;
import java.util.Random;

class Hangman {
    public static void main(String[] args) {
        String[] words = {"java", "kotlin", "python", "javascript"};
        Random randomIntGen = new Random();
        int randomInt = randomIntGen.nextInt(words.length);
        String word = words[randomInt];
        StringBuilder hiddenWord = new StringBuilder(word.substring(0, 2));
        hiddenWord.append("-".repeat(word.length() - 2));
        System.out.printf("HANGMAN \nGuess the word: %s:", hiddenWord);
        System.out.println();
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if (answer.equals(word)) {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}