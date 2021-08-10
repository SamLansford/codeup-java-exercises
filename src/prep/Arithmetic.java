package prep;

public class Arithmetic {

    public static int square(int number) {
        return number * number;
    }

    public static int sum(int[] numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static int difference(int num1, int num2) {
        return num1 - num2;
    }

    public static double product(double num1, double num2) {
        return num1 * num2;
    }

    public static double average(int[] numbers) {
        double sum = sum(numbers);
        return sum / numbers.length;
    }
}
