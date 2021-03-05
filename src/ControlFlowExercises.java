import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        Create an integer variable i with a value of 5.
//        int i = 5;


//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//        5 6 7 8 9 10 11 12 13 14 15

//        while (i <= 15) {
//            System.out.print(i + " ");
//            i+=1;
//        }

//        for(int i = 5; i <= 15; i++){
//            System.out.print(i + " ");
//        }


//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int i = 0;
//       do{
//           System.out.println(i+=2);
//       } while (i < 100);

//        for(int i = 0; i <= 100; i+=2) {
//            System.out.print(i);
//        }


//        Alter your loop to count backwards by 5's from 100 to -10.
//        int i = 100;
//        do{
//            System.out.print(i-=5);
//        } while (i > -10);
//
//        for(int i = 100; i >= -10; i-= 5) {
//            System.out.print(i);
//        }


//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536

//        double i = 2;
//
//        do{
//            System.out.println( (int) i);
//           i = Math.pow(i, 2);
//        } while (i < 1000000);

//        for(double i = 2; i < 1000000; i = Math.pow(i,2)) {
//            System.out.println( (int) i);
//        }


//        Write a program that prints the numbers from 1 to 100.
//        for(int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//            System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        IntStream.rangeClosed(1, 100)
//                .mapToObj(i -> i % 3 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz")
//                        : (i % 5 == 0 ? "Buzz" : i))
//                .forEach(System.out::println);


//        Display a table of powers.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please Enter an integer: ");
//        int userInput = sc.nextInt();
//        for (int i = 1; i <= userInput; i++) {
//            System.out.println(i + " " + i * i + " " + i * i * i);
//            if (i == userInput) {
//                System.out.println("Would you like to continue? ");
//                String userText = sc.next();
//                if (userText.equalsIgnoreCase("yes")) {
//                    System.out.println("how much further would you like to go?");
//                    int further = sc.nextInt();
//                    System.out.println();
//                    userInput += further;
//                }
//            }
//        }

//        Convert given number grades into letter grades
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a number from 0 to 100: ");
        int userInput = sc.nextInt();
        int aPlus = 99;
        int A = 88;
        int B = 80;
        int C = 67;
        int D = 60;
        int F = 59;

        String userText;
        do {
            if (userInput >= aPlus) {
                System.out.println("You got an " + userInput + " on the test." + "That an A+!");
            } else if (userInput >= A) {
                System.out.println("You got an " + userInput + " on the test." + " That an A!");
            } else if (userInput >= B) {
                System.out.println("You got an " + userInput + " on the test." + " That an B!");
            } else if (userInput >= C) {
                System.out.println("You got an " + userInput + " on the test." + " That an C!");
            } else if (userInput >= D) {
                System.out.println("You got an " + userInput + " on the test." + " That an D!");
            } else if (userInput >= F) {
                System.out.println("You got an " + userInput + " on the test." + " That an F!");
            }
            System.out.println("would you like to see it again?");
            userText = sc.next();
        } while (userText.equalsIgnoreCase("yes"));
    }
}
