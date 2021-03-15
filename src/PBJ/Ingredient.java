package PBJ;

import org.w3c.dom.ls.LSOutput;

public class Ingredient {

    public boolean tasteGood;

    public void flavor() {
        System.out.println("This ingredient's flavor taste like: ");
    }

    public void color() {
        System.out.println("The color of the ingredient is");
    }

    public void throwAway() {
        System.out.println("Throw away this ingredient");
    }

    protected int calories(int ca) {
        return ca;
    }


}
