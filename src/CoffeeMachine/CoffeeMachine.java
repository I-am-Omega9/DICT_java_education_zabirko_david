package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        System.out.printf("""
                The coffee machine has:
                %d of water
                %d of milk
                %d of coffee beans
                %d of disposable cups
                %d of money
                """, water, milk, beans, cups, money);
        Scanner userInput = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take):");
        String action = userInput.nextLine();
        switch (action) {
            case "buy" -> {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                String choice = userInput.nextLine();
                switch (choice) {
                    case "1" -> {
                        water = water - 250;
                        beans = beans - 16;
                        cups = cups - 1;
                        money = money + 4;
                    }
                    case "2" -> {
                        water = water - 350;
                        beans = beans - 20;
                        milk = milk - 75;
                        cups = cups - 1;
                        money = money + 7;
                    }
                    case "3" -> {
                        water = water - 200;
                        beans = beans - 12;
                        milk = milk - 100;
                        cups = cups - 1;
                        money = money + 6;
                    }
                }
            }
            case "fill" -> {
                System.out.println("Write how many ml of water you want to add:");
                int waterAdd = Integer.parseInt(userInput.nextLine());
                System.out.println("Write how many ml of milk you want to add:");
                int milkAdd = Integer.parseInt(userInput.nextLine());
                System.out.println("Write how many ml of beans you want to add:");
                int beansAdd = Integer.parseInt(userInput.nextLine());
                System.out.println("Write how many ml of beans you cups to add:");
                int cupsAdd = Integer.parseInt(userInput.nextLine());
                water = water + waterAdd;
                milk = milk + milkAdd;
                beans = beans + beansAdd;
                cups = cups + cupsAdd;
            }
            case "take" -> {
                System.out.printf("I give you %d money\n", money);
                money = 0;
            }
        }
        System.out.printf("""
                The coffee machine has:
                %d of water
                %d of milk
                %d of coffee beans
                %d of disposable cups
                %d of money""", water, milk, beans, cups, money);
    }
}