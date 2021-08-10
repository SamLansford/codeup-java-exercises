import java.util.Arrays;
import java.util.Scanner;

public class JavaIIIWarmUp {

    public static void main(String[] args) {
//        int[] myArray = new int[100];
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = (int) (Math.random() * (50 - 1)) + 1;
//        }
//        System.out.println("The average is: " + average(myArray));
//        System.out.println("The maxium number is: " + maximum(myArray));
//        System.out.println("The range of all the number is: " + range(myArray));
//        System.out.println("The mode of of all the number is: " + mode(myArray));
//        System.out.println("The histogram: ");
//        histogram(myArray);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to convert to camel case");
        String userInput = sc.nextLine();
        sc.close();
        System.out.println("You entered:" + userInput);
        System.out.println("Output is: " + convertToCamelCase(userInput));
    }

    public static String convertToCamelCase(String s) {
        String words[] = s.split("\\s+");

        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words) {
            char firstChar = word.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                stringBuilder.append(Character.toUpperCase(firstChar)).append(word.substring(1));
            } else {
                stringBuilder.append(word.substring(0));
            }
        }
        String result = stringBuilder.toString().trim();
        return result;
    }

    /* Write a method that calculates the average of the elements in the array. (3 marks)*/
    public static double average(int[] list) {
        double av = 0;
        int ii = 0;
        for (int p : list) {
            ii++;
            av = av + p;
        }
        av = av / ii;
        return av;
    }

    /* Write a method that calucluates the maximum number in the array (3 marks) */
    public static int maximum(int[] list) {
        int max = list[0];
        for (int p : list) {
            if (p > max) {
                max = p;
            }
        }
        return max;
    }

    /* Write a method that calulates the range (max - min) (3 marks)*/
    public static int range(int[] list) {
        int min = list[0];
        int Max = list[0];
        for (int l : list) {
            if (l < min) {
                min = l;
            }
            if (l > Max) {
                Max = l;
            }
        }
        return Max - min;
    }

    /* Write a method that determine the mode (the number that occurs the most often) (5 marks)*/
    public static int mode(int[] list) {
        int[] time = new int[50];
        int o = time[0];
        int i4 = 0;
        int i5 = 0;
        for (int n : list) {
            time[n - 1]++;
        }
        for (int nn : time) {
            if (nn > o) {
                o = nn;
            }
        }
        for (int m : time) {
            i4++;
            if (m == o) {
                i5 = i4;
            }
        }

        return i5;
    }


    /* Write a method that displays (prints) a bar graph (called a histogram) that shows the number in each five-unit range. The following is an example:
    1 - 5: **
    6 - 10: *****
    11 - 15: ***
    16 - 20: ***
    ...
    45 - 50: *******
    (6 marks)*/
    public static void histogram(int[] list) {
        int[] xx = new int[10];
        for (int k : list) {
            if (k <= 5)
                xx[0]++;
            if (k >= 6 && k <= 10)
                xx[1]++;
            if (k >= 11 && k <= 15)
                xx[2]++;
            if (k >= 16 && k <= 20)
                xx[3]++;
            if (k >= 21 && k <= 25)
                xx[4]++;
            if (k >= 26 && k <= 30)
                xx[5]++;
            if (k >= 31 && k <= 35)
                xx[6]++;
            if (k >= 36 && k <= 40)
                xx[7]++;
            if (k >= 41 && k <= 45)
                xx[8]++;
            if (k >= 46 && k <= 50)
                xx[9]++;
        }
        for (int io = 0; io < 10; io++) {
            System.out.print(io * 5 + 1 + " - " + (io + 1) * 5 + ": ");
            for (int z = 0; z < xx[io]; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

//        int[] numbers = {1,2,3,4,5,6,7};
//        System.out.println(Arrays.toString(Arrays.stream(numbers).toArray()));
//        String str = Arrays.toString(numbers);
//        System.out.println("int array as String in Java" + str);

//        int[] nums = {-5,1,2,11,3};
//        Arrays.sort(nums);
//        String[] a=Arrays.toString(nums).split("[\\[\\]]")[1].split(", ");
//        System.out.println(Arrays.toString(a));

//        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(Arrays.toString(numbers));
//        String str = Arrays.toString(numbers);
//        System.out.println("int array as String in Java : " + str);

//        System.out.println(sameFirstAndLast("Bob"));
//        System.out.println(sameFirstAndLast("steve"));
//        System.out.println(sameFirstAndLast("refrigerator"));
//        System.out.println(sameFirstAndLast("q2kdj3vq"));
//        System.out.println(sameFirstAndLast("radar"));
//        System.out.println(sameFirstAndLast("kate"));
//        System.out.println(sameFirstAndLast("John"));


//    public static boolean sameFirstAndLast(String input) {
//        char first = Character.toLowerCase(input.charAt(0));
//        char last = Character.toLowerCase(input.charAt(input.length() - 1));
//        return first == last;
//    }



