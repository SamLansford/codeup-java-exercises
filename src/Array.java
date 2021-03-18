
import java.util.*;

public class Array {
    public static void main(String[] args) {

//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        System.out.println(numbers);
//        numbers.set(0,10);
//        System.out.println(numbers);
//        Collections.sort(numbers);
//        System.out.println(numbers);
//        Collections.reverse(numbers);
//        System.out.println(numbers);


        Map<String, String>username = new HashMap<>();
        username.put("Sam", "lansford");
        username.put("Billy", "bob");
        username.put("John","brown");
        System.out.println(username);
        System.out.println(username.get("Sam"));
        System.out.println(username.getOrDefault("Ryan", "Something"));
    }
}
