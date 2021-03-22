import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIoPractice {

    public static void main(String[] args) {

        Path p = Paths.get("fileIo", "people.txt");

        List<String> names = new ArrayList<>();

        try {
            names = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(names);

        for (String name : names) {
            System.out.println(name + " Works at CodeUp");
        }

        List<String> newNames = new ArrayList<>();
        newNames.add("Sam");
        newNames.add("Carlos");
        newNames.add("Corey");
        newNames.add("Audi");
    }
}
