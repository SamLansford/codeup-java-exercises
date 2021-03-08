import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//        printAddition();
//        printSubtraction();
//        printMultiplication();
//        printDivision();
        printModulus();
    }

//    Create four separate methods. Each will perform an arithmetic operation:
//
//    Addition
//    Subtraction
//    Multiplication
//    Division

    //    Addition
    public static int addition() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 2 numbers so I can add them together");
        int x = sc.nextInt();
        int y = sc.nextInt();
        return x + y;
    }

    public static void printAddition() {
        System.out.println(addition());
    }

    //    Subtraction
    public static int subtraction() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 2 numbers so I can subtract them");
        int x = sc.nextInt();
        int y = sc.nextInt();
        return x - y;
    }

    public static void printSubtraction() {
        System.out.println(subtraction());
    }


    //    Multiplication

    public static int multiplication() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 2 numbers so I can multiply them together");
        double x = sc.nextInt();
        double y = sc.nextInt();

        return (int) (x / (1 / y));
    }

    public static void printMultiplication() {
        System.out.println(multiplication());
    }

    // Division

    public static int division() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 2 numbers so I can divide them");
        int x = sc.nextInt();
        int y = sc.nextInt();

        return x / y;
    }

    public static void printDivision() {
        System.out.println(division());
    }

    // Modulus

    public static int modulus() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 2 numbers so I can modulus? them together");
        int x = sc.nextInt();
        int y = sc.nextInt();
        return x % y;
    }

    public static void printModulus() {
        System.out.println(modulus());
    }

    // Create a method that validates that user input is in a certain range

}

