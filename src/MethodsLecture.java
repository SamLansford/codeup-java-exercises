import java.util.Locale;
import java.util.Scanner;

public class MethodsLecture {
    public static void main(String[] args) {

//        System.out.println(getNameString("Sam"));
//        printSalutation("Sam");

        printName();


    }

    // ============== Method Definitions ===============

    // *** Access Modifiers ***

//    public static void printSalutation(String name){
//        System.out.println(tryGetSalutation(name));
//    }
//
//    public static String tryGetSalutation(String name){
//
//        if ((name == null) || (name.equals(""))){
//            return "No name provided";
//        }
//        else {
//            return getSalutation(name, "Why hello ");
//        }
//    }
//
//    public static String getSalutation(String name, String greeting) {
//        return  greeting + name.toUpperCase();
//    }

    // *** Static vs Instance ***

    public static int doTheMathStatic() {
        return 1 + 2;
    }
//
//    public int doTheMathInstance() {
//        return 1+2;
//    }

    // *** Returning vs Void ***

//    public static String getGreeting() {
//        return "Hai";
//    }
//
//    public static void printGreeting(){
//        System.out.println(getGreeting());
//    }

    // *** Parameters ***


    // ============ Mini Exercise #1 =============

    /* TODO:
     *   -Write a public static method which returns an integer
     *   -The method should take in *two parameters* and *return* the product of multiplying them
     *   -Print the output to the console by calling the method, passing in params, and logging its output
     *   BONUS: Use the Scanner class to get the numbers from the user input
     * */

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void printMultiply(int num1, int num2) {
        System.out.println(multiply(num1, num2));
    }

    public static void multiplyUserInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter two numbers to multiply...");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        printMultiply(num1, num2);
    }

    // ============== Method Overloading ===============

    public static int doMath() {
        return 1 + 1;
    }


    public static int doMath(int num1) {
        return num1 + doMath();
    }

    public static int doMath(int num1, int num2) {
        return num2 + doMath(num1) + doMath();
    }


    // ============ Mini Exercise #2 =============

    /* TODO: Write a set of overloaded public static void methods which can take in 1-3 names and print them to the console
     *   -Call each of the methods, passing in the names for each
     *   -Minus 1000pts if you don't use an oxford comma on the 3 param version
     *   BONUS: Use the Scanner class to get the names from user input
     *  */

    public static void printName(String name) {
        System.out.printf("Hello, %s\n", name);
    }

    public static void printName(String name1, String name2) {
        System.out.printf("Hello, %s and %s\n", name1, name2);
    }

    public static void printName(String name1, String name2, String name3) {
        System.out.printf("Hello, %s, %s, %s\n", name1, name2, name3);
    }

    public static void printName() {

        String name1 = "Sam";
        String name2 = "Justin";
        String name3 = "Bob";
        printName(name1);
        printName(name1, name2);
        printName(name1, name2, name3);
    }


    // ============== Recursion ===============


    // ============== Responsible Method Use ===============
}

