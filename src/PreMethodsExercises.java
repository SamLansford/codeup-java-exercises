import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PreMethodsExercises {
    public static void main(String[] args) {


//        userFirstLetter();
//        userSecondLetter();
//        userLastLetter();
//        SecondLastChar();
//        userWantsToContinue();
//        isEven();
//        isOdd();
//        countOdds();
//        printFizzBuzzRecursion(1, 100);
        System.out.println(sum(20));

    }


//        1.Write a method named firstChar() that takes a string as an input and returns the first letter as a
//        character data type.

    public static char firstChar(String letter) {
        return letter.charAt(0);
    }

    public static void printFirstChar(String letter) {
        System.out.println(firstChar(letter));
    }

    public static void userFirstLetter() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string so I can give you the first letter in that string");
        String letter = sc.next();

        printFirstChar(letter);
    }


//        2.Write a method named secondChar () that takes a string as an input and returns the first letter as a
//        character data type.

    public static char secondChar(String letter) {
        return letter.charAt(1);
    }

    public static void printSecondChar(String letter) {
        System.out.println(secondChar(letter));
    }

    public static void userSecondLetter() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string so I can give you the second letter of the string");
        String letter = sc.next();

        printSecondChar(letter);

    }
//

//        3.Write a method named lastChar () that takes a string as an input and returns the last letter as a
//        character data type.

    public static char lastChar(String letter) {
        return letter.charAt(letter.length() - 1);
    }

    public static void printLastLetter(String letter) {
        System.out.println(lastChar(letter));
    }

    public static void userLastLetter() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string so I can give you the last letter of the string");
        String letter = sc.next();

        printLastLetter(letter);
    }


//        4.Write a method named secondToLastChar () that takes a string as an input and returns the second to
//        last letter as a character data type.

    public static void SecondLastChar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string so I can return the second to last letter to you");
        String letter = sc.next();
        int length = letter.length();
        if (length >= 2)
            System.out.println("Second Last String is : " + letter.charAt(length - 2));
    }


//        5.Write a method named userWantsToContinue().This method should prompt the user if they want to continue and then
//        return a boolean value if the user inputs "y" or "yes".

    public static void userWantsToContinue() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like to continue?");
        String userInput = sc.next();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
            System.out.println("We will continue");
        }
    }

//        6.Write a method named isEven () that takes in an integer and returns a boolean if the input is even
//        or not.

    public static void isEven() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number so I can tell you if it's even or not");
        int number = sc.nextInt();
        System.out.println(number % 2 == 0);
    }


//        7.Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.

    public static void isOdd() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number so I can tell you if it's odd or not");
        long number = sc.nextInt();
        System.out.println(number % 2 != 0);
    }

//        8.Write a method named countOdds(start, end) that returns an integer containing the integer that is the count of
//        all odd numbers between the start and the end input integers.

//    public static void countOdds() {
//        int Size, i, oddCount = 0;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter numbers of elements in an array");
//        Size = sc.nextInt();
//
//        int[] a = new int[Size];
//
//        System.out.println("Please enter" + Size + "elements of an array");
//        for (i = 0; i < Size; i += 1) {
//            if (a[i] % 2 != 0) {
//                System.out.println(a[i] + " ");
//                oddCount++;
//            }
//        }
//        System.out.println("\n Total number of odd numbers in this array = " + oddCount);
//    }


//        9.Write a method named countEvens (start, end)that returns an integer containing the integer that is the
//        count of all even numbers between the start and the end input integers.


//        10.Write a method named isVowel () that accepts a String input of length 1 and returns a boolean if
//        that string is a vowel other than "y".


//        11.Write a method named hasVowels () that accepts a string of any length and returns a boolean if there are
//        any vowels in that string.


//        12.Write a method named countVowels () that accepts a string of any length and returns an integer count
//        of the number of vowels in the provided input String.


//        13.Write a solution to FizzBuzz using recursion instead of a loop.

    public static void printFizzBuzzRecursion(final int start, final int end) {
        if (start <= end) {
            String toPrint = "";
            if (start % 3 == 0)
                toPrint += "Fizz";
            if (start % 5 == 0)
                toPrint = "Buzz";
            if (start % 3 == 0 && start % 5 == 0)
                toPrint = "FizzBuzz";
            System.out.println(toPrint.length() > 0 ? toPrint : start);
            printFizzBuzzRecursion(start + 1, end);
        }
    }


//        14.Write a method named isPrime () that that accepts in an integer number and returns a boolean if
//        the number is evenly divisible only by either 1 or the number itself.


//        15.Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.







// This function adds a all the numbers together from highest to lowest like if I input a 5 it's going to add (5 + 4 + 3 + 2 + 1);
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}