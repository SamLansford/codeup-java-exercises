package util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public static String getString() {
        return scanner.nextLine();
    }

    public int getInt() {

        try{
           return Integer.parseInt(getString());
        }catch (NumberFormatException e) {
            System.out.printf("Input could not be parsed into an integer. %s\n", e.getMessage());
            System.out.println("Try again");
            return getInt();
        }
    }

    public int getInt(int min, int max) {
        int userInput = getInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("That's the right number");
            return userInput;
        } else {
            System.out.println("Please enter a number between " + min + " and " + max);
        }
        return getInt(min, max);
    }

    public double getDouble() {

        try {
            return Double.parseDouble(getString());
        }catch (NumberFormatException e) {
            System.out.printf("Input could not parsed into an double. %s\n", e.getMessage());
            System.out.println("Please try again");
            return getDouble();
        }

    }

    public double getDouble(double min, double max) {
        double userInput = getDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Please enter a decimal number between " + min + " and " + max);
        }
        return getDouble(min, max);
    }

    public boolean yesNo() {
        System.out.println("Please type something");
        String userInput = scanner.nextLine();
        return (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y"));
    }
}
