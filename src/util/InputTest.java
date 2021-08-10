package util;

public class InputTest {
    public static void main(String[] args) {

        Input input = new Input();
//        input.yesNO();
        input.getInt(1, 10);
        input.getDouble(2.5, 5.4);
    }
}
