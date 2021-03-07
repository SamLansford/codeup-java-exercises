import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {


        charUserInput();
    }


//        1.Write a method named firstChar() that takes a string as an input and returns the first letter as a
//        character data type.

    public static char firstChar(String letter) {
        return letter.charAt(0);
    }

    public static void printFirstChar(String letter) {
        System.out.println(firstChar(letter));
    }

    public static void charUserInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter something so I can give you the first character in that string");
        String letter = sc.next();

        printFirstChar(letter);
    }

//        2.Write a method named secondChar () that takes a string as an input and returns the first letter as a
//        character data type.


//        3.Write a method named lastChar () that takes a string as an input and returns the last letter as a
//        character data type.


//        4.Write a method named secondToLastChar () that takes a string as an input and returns the second to
//        letter as a character data type.


//        5.Write a method named userWantsToContinue().This method should prompt the user if they want to continue and then
//        return a boolean value if the user inputs "y" or "yes".


//        6.Write a method named isEven () that takes in an integer and returns a boolean if the input is even
//        or not.


//        7.Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.


//        8.Write a method named countOdds(start, end) that returns an integer containing the integer that is the count of
//        all odd numbers between the start and the end input integers.


//        9.Write a method named countEvens (start, end)that returns an integer containing the integer that is the
//        count of all even numbers between the start and the end input integers.


//        10.Write a method named isVowel () that accepts a String input of length 1 and returns a boolean if
//        that string is a vowel other than "y".


//        11.Write a method named hasVowels () that accepts a string of any length and returns a boolean if there are
//        any vowels in that string.


//        12.Write a method named countVowels () that accepts a string of any length and returns an integer count
//        of the number of vowels in the provided input String.


//        13.Write a solution to FizzBuzz using recursion instead of a loop.


//        14.Write a method named isPrime () that that accepts in an integer number and returns a boolean if
//        the number is evenly divisible only by either 1 or the number itself.


//        15.Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.
}

