package grades;

import util.Input;

import java.util.Map;

public class GradesApplication {

    private final Map<String, Student> student;

    private final Input input;

    public GradesApplication(Map<String, Student> student, Input input) {
        this.student = student;
        this.input = input;
    }

    public void init() {
        System.out.println("Welcome!");
        runInteraction();
    }

    private void runInteraction() {
        
    }
}
