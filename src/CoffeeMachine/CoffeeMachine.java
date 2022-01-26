package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Write how many ml of water the coffee machine has: ");
        Scanner userInput = new Scanner(System.in);
        int water = Integer.parseInt(userInput.nextLine());
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = Integer.parseInt(userInput.nextLine());
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beans = Integer.parseInt(userInput.nextLine());
        System.out.println("Write how many cups of coffee you need: ");
        int needed = Integer.parseInt(userInput.nextLine());
        int cups = count(water, milk, beans);
        if (cups == needed) {
            System.out.println("Yes, i can do this.");
        }
        else if (cups > needed){
            System.out.printf("Yes, i can do this (and even %d more than that)", cups - needed);
        }
        else {
            System.out.printf("No, i can do only %d cups of coffee", cups);
        }
    }
    public static int count (int water, int milk, int beans) {
        int cups = 0;
        while (true) {
            if (water - 200 < 0) {
                break;
            }
            water = water - 200;
            if (milk - 50 < 0) {
                break;
            }
            milk = milk - 50;
            if (beans -15 < 0) {
                break;
            }
            beans = beans - 15;
            cups += 1;
        }
        return cups;
    }
}