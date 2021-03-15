package PBJ;

public class Jelly extends Ingredient {

    public void flavor() {
        System.out.println("The flavor of this jelly taste like grapes");
    }

    public void color() {
        System.out.println("The color of the jelly is purple");
    }

    public void throwAway() {
        System.out.println("Throw away jelly");
    }

    @Override
    protected int calories(int ca) {
        return super.calories(ca);
    }

    public void printCalories(int ca) {
        System.out.println("The calories of jelly is " + calories(ca));
    }
}
