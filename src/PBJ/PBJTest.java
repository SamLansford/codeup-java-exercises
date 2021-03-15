package PBJ;

public class PBJTest {

    public static void main(String[] args) {

        Knife knife = new Knife();
        knife.usage();
        knife.clean();
        Plate plate = new Plate();
        plate.usage();
        plate.clean();
        PeanutButter peanutbutter = new PeanutButter();
        peanutbutter.flavor();
        peanutbutter.color();
        Bread bread = new Bread();
        bread.flavor();
        bread.color();
        Jelly jelly = new Jelly();
        jelly.flavor();
        jelly.color();
    }
}
