import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {


        playGame(new Scanner(System.in), (int)(Math.random()* 100) + 1);
    }

    public static void initializeGame() {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int)(Math.random()*100)+1;
        System.out.println("Please guess a number between 1 and 100: ");

        playGame(sc, randomNumber);
    }


    public static void playGame(Scanner sc, int randomNumber) {

        System.out.print("Please guess a number between 1 and 100: ");
        int userGuess = sc.nextInt();
        if (userGuess < 1 || userGuess > 100) {
            System.out.println("Your guess is out of bonds. Please try again");
            playGame(sc, randomNumber);
        } else {
           String response = checkGuess(userGuess, randomNumber);
           if (response.equals("Good Guess!")) {
               System.out.println(response);
           } else {
               System.out.println(response);
               playGame(sc, randomNumber);
           }
        }

    }

    public static String checkGuess(int guess, int targetNum) {

        if (guess == targetNum) {
            return "Good Guess!";
        } else if (guess > targetNum) {
            return "Number is High, guess lower";
        } else if (guess < targetNum) {
            return "Number is low, guess higher";
        }
        return "";
    }
}
