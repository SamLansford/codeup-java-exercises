import java.util.*;

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
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a sentence to convert to camel case");
//        String userInput = sc.nextLine();
//        sc.close();
//        System.out.println("You entered:" + userInput);
//        System.out.println("Output is: " + convertToCamelCase(userInput));
//        String s = "osefkjself";
//        System.out.println(finddigits(s));
//        System.out.println(countingValleys(4,"UDDU"));
//        System.out.println(repeatedString("abac",4));
//        System.out.println(makeAnagram("adca","asefa"));
//        System.out.println(alternatingCharacters("aaabbbaabab"));
//        System.out.println(twoStrings("bib","go"));

//        float first = 12.0f, second = 24.5f;
//
//        System.out.println("--Before swap--");
//        System.out.println("First number = " + first);
//        System.out.println("Second number = " + second);
//
//        first = first - second;
//        second = first + second;
//        first = second - first;
//
//        System.out.println("--After swap--");
//        System.out.println("First number = " + first);
//        System.out.println("Second number = " + second);

//        int dividend = 25, divisor = 4;
//
//        int quotient = dividend / divisor;
//        int remainder = dividend % divisor;
//
//        System.out.println("Quotient = " + quotient);
//        System.out.println("Remainder = " + remainder);
        System.out.println(fizzBuzz(24));

    }

    public static boolean fizzBuzz(int i)
    {

        for (i = 1; i <= 100; i++)
        {
            if (((i % 5) == 0) && ((i % 7) == 0)) // Is it a multiple of 5 & 7?
                System.out.println("fizzbuzz");
            else if ((i % 5) == 0) // Is it a multiple of 5?
                System.out.println("fizz");
            else if ((i % 7) == 0) // Is it a multiple of 7?
                System.out.println("buzz");
            else
                System.out.println(i); // Not a multiple of 5 or 7
        }
        return false;
    }

    public static void countSwaps(List<Integer> a) {
        Boolean unsorted = true;
        Integer swaps = 0;
        Integer uLen = a.size() - 1;
        while(unsorted){
            unsorted = false;
            for (Integer i = 0; i < uLen; i++ ){
                if(a.get(i)>a.get(i+1)){
                    unsorted = true;
                    swap(a, i, i+1);
                    swaps++;
                }
            }
        }
        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: "+a.get(0));
        System.out.println("Last Element: "+a.get(a.size()-1));
        return;

    }

    public static List<Integer> swap(List<Integer> arr, Integer a, Integer b){
        Integer tmp = arr.get(a);
        arr.set(a, arr.get(b));
        arr.set(b, tmp);
        return arr;
    }

    public static void minimumBribes(List<Integer> q) {
        int numBribes = 0;
        for (int i = 0; i < q.size() - 1; i++) {
            int j = i;
            if (i + 3 < q.get(i)) {
                System.out.println("Too chaotic");
                return;
            } while (q.get(i) > q.get(i+1)) {
                numBribes++;
                int tmp = q.get(i);
                q.set(i, q.get(i+1));
                q.set(i+1, tmp);
                i = Math.max(0, i - 1);
            }
        }
        System.out.println(numBribes);
    }


    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<arr.size()-2;i++)
        {
            for (int j=0;j<arr.get(i).size()-2;j++)
            {
                int sum=arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+
                        arr.get(i+1).get(j+1)+
                        arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);

                if (sum > maxSum)
                {
                    maxSum=sum;
                }
            }
        }
        return maxSum;
    }

    public static String twoStrings(String s1, String s2) {
        HashMap<String, Integer> vales = new HashMap<String, Integer>();
        for (char c: s1.toCharArray()) {
            vales.put(c+"", 1);
        }
        for (char c : s2.toCharArray()) {
            if (vales.get(c+"") != null) {
                return "YES";
            }
        }
        return "NO";

    }


    public static int alternatingCharacters(String s) {
        char [] caractere=s.toCharArray();

        char ant=caractere[0];
        int cont=0;
        for(int i=1;i<caractere.length;i++){
            if(caractere[i]==ant){
                cont++;
            }else{
                ant=caractere[i];
            }
        }

        return cont;
    }

    public static int makeAnagram(String a, String b) {
        StringBuilder res = new StringBuilder();
        int delCount = 0;
        if(a.matches("[a-z]+") && b.matches("[a-z]+") && a.length()<=10000 && b.length()<=10000){

            if (a != null && a != "" && b != null) {
                StringBuilder s1 = new StringBuilder(a);
                StringBuilder s2 = new StringBuilder(b);
                for (int i = 0; i < s1.length(); i++) {
                    for (int j = 0; j < s2.length(); j++) {
                        if (s1.charAt(i) == s2.charAt(j)) {
                            res.append(a.charAt(i));
                            s2.deleteCharAt(j);
                            break;
                        }
                    }
                }

            }
            System.out.println(res.toString());
            delCount += (a.length() - res.length());
            delCount += (b.length() - res.length());
        }
        return delCount;
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int len = a.size();
        if (len <= 1) return a;
        for (int i=0; i<d; i++) {
            a.add(a.get(0));
            a.remove(0);
        }
        return a;
    }

    static int sum(List<List<Integer>> arr, int centerR, int centerC) {
        int val = arr.get(centerR).get(centerC);
        for (int col = centerC - 1; col <= centerC + 1 ; col++) {
            val += arr.get(centerR-1).get(col);
            val += arr.get(centerR+1).get(col);
        }
        return val;
    }


    public static long repeatedString(String s, long n) {
        long rep = n / s.length();
        int modulo = (int ) (n % s.length());

        long cont = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == 'a') cont++;

        cont = cont * rep;

        for (int i = 0; i < modulo; i++)
            if (s.charAt(i) == 'a') cont++;

        return cont;
    }


    public static int sockMerchant(int n, List<Integer> ar) {
        int count = 0;
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i = 0; i< n; i++) {
            if(!hash.contains(ar.get(i))) {
                hash.add(ar.get(i));
            } else {
                hash.remove(ar.get(i));
                count++;
            }
        }
        return count;
    }



    public static int countingValleys(int steps, String path) {
        int altitude = 0;
        int num_valleys = 0;

        for(int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                if(altitude == -1) {
                    num_valleys++;
                }
                altitude++;
            } else {
                if(path.charAt(i) == 'D') {
                    altitude--;
                }
            }
        }
        return num_valleys;
    }

    static String finddigits(String s)
    {

        // Strings of digits 0-9
        String[] num
                = { "zero", "one", "two",   "three", "four",
                "five", "six", "seven", "eight", "nine" };

        // Initialize vector
        int[] arr = new int[10];

        // Initialize answer
        String ans = "";

        // Size of the string
        int n = s.length();

        // Traverse the string
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'z')
                arr[0]++;
            if (s.charAt(i) == 'w')
                arr[2]++;
            if (s.charAt(i) == 'g')
                arr[8]++;
            if (s.charAt(i) == 'x')
                arr[6]++;
            if (s.charAt(i) == 'v')
                arr[5]++;
            if (s.charAt(i) == 'o')
                arr[1]++;
            if (s.charAt(i) == 's')
                arr[7]++;
            if (s.charAt(i) == 'f')
                arr[4]++;
            if (s.charAt(i) == 'h')
                arr[3]++;
            if (s.charAt(i) == 'i')
                arr[9]++;
        }

        // Update the elements of the vector
        arr[7] -= arr[6];
        arr[5] -= arr[7];
        arr[4] -= arr[5];
        arr[1] -= (arr[2] + arr[4] + arr[0]);
        arr[3] -= arr[8];
        arr[9] -= (arr[5] + arr[6] + arr[8]);

        // Print the digits into their
        // original format
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < arr[i]; j++) {
                ans += (char)(i + '0');
            }
        }

        // Return answer
        return ans;
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



