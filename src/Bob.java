import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ask Bob a question");
        String userText = sc.nextLine();
        if (userText.endsWith("?")) {
            System.out.println("Sure");
        } else if (userText.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userText.endsWith("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("What ever");
        }
    }
}