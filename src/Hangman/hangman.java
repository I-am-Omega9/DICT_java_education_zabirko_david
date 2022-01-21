package Hangman;
import java.util.Random;
import java.util.Scanner;

class Hangman {
    public static void main(String[] args) {
        String[] words = {"java", "kotlin", "python", "javascript"};
        String word = generateWord(words);
        StringBuilder hiddenWord = hiddenWordGen(word);
        System.out.println("HANGMAN");
        int lives = 8;
        while (true) {
            if (lives == 0){
                System.out.println("You lost! \nThanks for playing!\nWe'll see how well you did in the next stage.");
                break;
            } else {
                if (hiddenWord.indexOf("-") != -1) {
                    System.out.printf("Guess the word %s:", hiddenWord);
                    System.out.println();
                    Scanner userInput = new Scanner(System.in);
                    String answer = userInput.nextLine();
                    if (!word.contains(answer)) {
                        System.out.println("The letter doesn't appear in word.");
                        --lives;
                    }
                    else if (hiddenWord.indexOf(answer) != -1){
                        System.out.println("No improvements.");
                        --lives;
                    }
                    else {
                        updateHiddenWord(hiddenWord, answer, word);
                    }
                } else {
                    System.out.println(hiddenWord);
                    System.out.println("You win! \nThanks for playing!\nWe'll see how well you did in the next stage.");
                    break;
                }
            }
        }
    }
    public static String generateWord(String[] wordsArr) {
        Random randomIntGen = new Random();
        int randomInt = randomIntGen.nextInt(wordsArr.length);
        return wordsArr[randomInt];
    }
    public static StringBuilder hiddenWordGen(String word) {
        StringBuilder hiddenWord = new StringBuilder();
        hiddenWord.append("-".repeat(word.length()));
        return hiddenWord;
    }
    public static void updateHiddenWord(StringBuilder hiddenWord, String answer, String  word) {
        int index = 0;
        while (index >= 0) {
            index = word.indexOf(answer, index);
            if (index >= 0) {
                hiddenWord.setCharAt(index, answer.charAt(0));
                ++index;
            }
        }
    }
}