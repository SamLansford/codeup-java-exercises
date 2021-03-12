import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adjectives = {"Charming", "Cruel", "Fantastic", "Gentle", "Huge", "small", "big", "light", "dark", "sharp"};
        String[] nouns = {"cat", "dog", "people", "Bob", "John", "hat", "bat", "bird", "fish"};

        Random random = new Random();
        int randomAdj = random.nextInt(adjectives.length);
        int randomNoun = random.nextInt(nouns.length);
        System.out.println(adjectives[randomAdj] + "-" + nouns[randomNoun]);

    }

}
