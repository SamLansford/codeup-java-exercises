
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
    //TODO: return the person's name
        return this.name;
    }

    public void setName(String name) {
    //TODO: change the name property to the passed value
         this.name = name;
    }

    public void sayHello(String name) {
    //TODO: print a message to the console using the person's name
        System.out.println("Hello " + this.name);

    }

    public static void main(String[] args) {
        Person p1 = new Person("Sam");
//        p1.name = "Sam";
        p1.sayHello("");
        p1.setName("John");
        p1.sayHello("");
        System.out.println(p1.getName());

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
    }
}


