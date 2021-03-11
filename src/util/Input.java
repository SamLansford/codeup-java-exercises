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

    public boolean yesNO() {
        System.out.println("Please type something");
        String userInput = scanner.nextLine();
        return (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y"));
    }



//    public int getInt(String prompt) {
//        System.out.println(prompt);
//        Scanner sc = new Scanner(System.in);
//        while (!sc.hasNext()) {
//            System.out.println("Please enter a whole number");
//            sc.nextInt();
//        }
//        return sc.nextInt();
//
//    }

    public int getInt() {
        System.out.println("Please enter a whole number");
        if (scanner.hasNext()) {
            return scanner.nextInt();
        } else {
            scanner.nextLine();
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
//        System.out.println("Please enter a decimal number");
        if (scanner.hasNext()) {
            return scanner.nextDouble();
        } else {
            scanner.nextLine();
            return getDouble();
        }
    }

    public double getDouble(double min, double max) {
        double userInput = getDouble();
        if (userInput >= min && userInput <= max) {
            System.out.println("That's the right number");
            return userInput;
        } else {
            System.out.println("Please enter a decimal number between " + min + " and " + max);
        }
        return getDouble(min, max);
    }

}
