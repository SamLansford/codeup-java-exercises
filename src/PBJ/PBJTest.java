package PBJ;

public class PBJTest {

    public static void main(String[] args) {

        Knife knife = new Knife();
        knife.usage();
        knife.clean();
        knife.shape();


        Plate plate = new Plate();
        plate.usage();
        plate.clean();
        plate.shape();


        PeanutButter peanutbutter = new PeanutButter();
        peanutbutter.flavor();
        peanutbutter.color();
        peanutbutter.throwAway();


        Bread bread = new Bread();
        bread.flavor();
        bread.color();
        bread.throwAway();


        Jelly jelly = new Jelly();
        jelly.flavor();
        jelly.color();
        jelly.throwAway();
    }
}
