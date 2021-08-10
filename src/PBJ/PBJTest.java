package PBJ;

public class PBJTest {

    public static void main(String[] args) {

        Knife knife = new Knife();
        knife.usage();
        knife.clean();
        knife.shape();
        knife.isClean = true;


        Plate plate = new Plate();
        plate.usage();
        plate.clean();
        plate.shape();
        plate.isClean = true;


        PeanutButter peanutbutter = new PeanutButter();
        peanutbutter.flavor();
        peanutbutter.color();
        peanutbutter.tasteGood = true;
        peanutbutter.throwAway();


        Bread bread = new Bread();
        bread.flavor();
        bread.color();
        bread.tasteGood = true;
        bread.throwAway();


        Jelly jelly = new Jelly();
        jelly.flavor();
        jelly.color();
        jelly.tasteGood = true;
        jelly.throwAway();
        jelly.printCalories(83);
    }
}
