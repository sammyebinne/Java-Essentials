package dollar_game;

import java.util.Scanner;

public class DollarGame {

    public static void main(String[] args) {

        System.out.println("Welcome to CHANGE FOR A DOLLAR! Your goal is to enter enough change to make exactly $1.00");

        Scanner scanner = new Scanner(System.in);

        //    Ask how many pennies (0.01)
        System.out.println("How many pennies do you have?");
        int pennies = scanner.nextInt();

        //    Ask how many nickels (0.05)
        System.out.println("How many nickels do you have?");
        int nickels = scanner.nextInt();

        //    Ask how many dimes (0.1)
        System.out.println("How many dimes do you have?");
        int dimes = scanner.nextInt();

        //    Ask how many quarters (0.25)
        System.out.println("How many quarters do you have?");
        int quarters = scanner.nextInt();

        scanner.close();

        double totalAmount = calculateTotalAmount(pennies, nickels, dimes, quarters);
        double difference = Math.abs(totalAmount - 1);

        printResult(totalAmount, difference);
    }

    private static double calculateTotalAmount(int pennies, int nickels, int dimes, int quarters) {
        return (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);
    };

    private static void printResult(double total, double difference) {
        String message;

        if (total > 1) {
            message = String.format("Oof! You're over by $%.2f. Better luck next time!", difference);
        } else if (total < 1) {
            message = String.format("Ouch! You're short by $%.2f. Get your coins up!", difference);
        } else {
            message = "Congratulations! You're right on the money!!";
        }

        System.out.println(message);
    }

}

