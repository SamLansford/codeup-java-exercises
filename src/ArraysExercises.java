import java.util.Arrays;


public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] peoples = new Person[3];
        peoples[0] = new Person("Sam");
        peoples[1] = new Person("John");
        peoples[2] = new Person("Jeff");
        peoples[3] = new Person("Jay");

        for (Person people : peoples) {
            System.out.println(people.getName());
        }

        peoples = addPerson(peoples, new Person("Bill"));

        for (Person people : peoples) {
            System.out.println(people.getName());
        }


    }

    public static Person[] addPerson(Person[] people, Person person) {

        Person[] newPeople = Arrays.copyOf(people, people.length + 1);

        newPeople[newPeople.length - 1] = person;

        return newPeople;
    }


}
