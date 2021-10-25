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
//        System.out.println(fizzBuzz(24));

//        double  dis,amount,markedprice,s;
//        markedprice=1000;
//        dis=25;
//        System.out.println("markedprice= "+markedprice);
//        System.out.println("discount rate="+dis);
//        s=100-dis;
//        amount= (s*markedprice)/100;
//        System.out.println("amount after discount="+amount);

//        int n;double res=0;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter how many numbers to cal  avg");
//        n=sc.nextInt();
//        int a[]=new int[n];
//        System.out.println("enter   "+n+"  numbers");
//        for(int i=0;i<n;i++)
//            a[i]=sc.nextInt();
//        for(int i=0;i<n;i++)
//            res =res+a[i];
//        System.out.println("average="+res/n);

//        int x1,x2,y1,y2;
//        double dis;
//        x1=1;y1=1;x2=4;y2=4;
//        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
//        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);

//        int n, res,i,j=0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter number of elements in the array:");
//        n = s.nextInt();
//        int array[] = new int[n];
//        int rev[] = new int[n];
//        System.out.println("Enter "+n+" elements ");
//        for( i=0; i < n; i++)
//        {
//            array[i] = s.nextInt();
//        }
//        System.out.println("Reverse of an array is :");
//        for( i=n;i>0 ; i--,j++)
//        {
//            rev[j] = array[i-1];
//            System.out.println(rev[j]);
//
//        }

//        String s;
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter a string : ");
//        s=sc.nextLine();
//        System.out.println("Vowels in a string '"+s+"' are :");
//        vowels(s);

//        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
//        int rem,num;
//        String hexadecimal="";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Decimal number: ");
//        num=sc.nextInt();
//        System.out.println("Hexadecimal number is : ");
//        while(num != 0)
//        {
//            rem=num%16;
//            hexadecimal= ch[rem] + hexadecimal;
//            num= num/16;
//        }
//        System.out.print(hexadecimal);


//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter N : ");
//        int n=sc.nextInt();
//        System.out.print("Enter Symbol : ");
//
//        char c = sc.next().charAt(0);
//
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=n-i;j++)
//
//            {
//                System.out.print(" ");
//            }
//
//            for(int j=1;j<=i*2-1;j++)
//
//            {
//                System.out.print(c);
//            }
//            System.out.println();
//
//        }
//        for(int i=n-1;i>0;i--)
//        {
//            for(int j=1;j<=n-i;j++)
//
//            {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i*2-1;j++)
//
//            {
//                System.out.print(c);
//            }
//            System.out.println();
//        }
//    }
//
//    static void vowels(String str)
//    {
//        char ch;
//        int i=0;
//        for(int j=0;j<str.length();j++)
//        {
//            ch=str.charAt(j);
//            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
//            {
//                i=1;
//                System.out.println(ch);
//            }
//        }
//        if(i==0)
//            System.out.println("There are no vowels in a entered string");


//        int n, res,i;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter number of elements in the array:");
//        n = s.nextInt();
//        int a[] = new int[n];
//        System.out.println("Enter "+n+" elements ");
//        for( i=0; i < n; i++)
//        {
//            a[i] = s.nextInt();
//        }
//
//        System.out.println( "elements in array ");
//        printarray(a);
//        Sort(a);
//        System.out.println( "\nelements after sorting");
//        printarray(a);

//        int oct, dec=0, i=0, t;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Octl Number : ");
//        oct = sc.nextInt();
//        while(oct != 0)
//        {
//            dec =dec + (oct%10) *(int)Math.pow(8, i);
//            i++;
//            oct = oct/10;
//        }
//        String hex=hexdecimal(dec);
//        System.out.println("Hexdecimal number is :"+hex);

//        int i,len, key, array[];
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter Array length:");
//
//        len = input.nextInt();
//
//        array = new int[len];
//
//        System.out.println("Enter " + len + " elements");
//
//        for (i = 0; i < len; i++)
//        {
//            array[i] = input.nextInt();
//        }
//        System.out.println("Enter the search key value:");
//        key = input.nextInt();
//        for (i = 0; i < len; i++)
//        {
//            if (array[i]== key)
//            {
//                System.out.println(key+" is present at location "+(i+1));
//                break;
//            }
//        }
//        if (i == len)
//            System.out.println(key + " doesn't exist in array.");

//        long a,y,c;
//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter  any  calendar year :");
//        y=sc.nextLong();
//        if(y!=0)
//        {
//            a=(y%400==0)?(c=1):((y%100==0)?(c=0):((y%4==0)?(c=1):(c=0)));
//            if(a==1)
//                System.out.println(y+" is a leap year");
//            else
//                System.out.println(y+" is not a leap year");
//        }
//        else
//            System.out.println("year zero does not exist ");

//        long year;
//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter  any calendar year :");
//        year=sc.nextLong();
//        leapOrNot(year);

//        double  dis,amount,markedprice,s;
//
//        markedprice=1000;
//
//        dis=25;  // 25 mean 25%
//
//        System.out.println("markedprice= "+markedprice);
//
//        System.out.println("discount rate="+dis);
//
//        s=100-dis;
//
//        amount= (s*markedprice)/100;
//
//        System.out.println("amount after discount="+amount);

//            long units;
//
//            Scanner sc=new Scanner(System.in);
//
//            System.out.println("enter number of units");
//
//            units=sc.nextLong();
//
//            double billpay=0;
//
//            if(units<100)
//                billpay=units*1.20;
//
//            else if(units<300)
//                billpay=100*1.20+(units-100)*2;
//
//            else if(units>300)
//                billpay=100*1.20+200 *2+(units-300)*3;
//
//            System.out.println("Bill to pay : " + billpay);
//
//        }

//        int n=5,p=3,result=1;
//
//        if(n>=0&&p==0)
//        {
//            result=1;
//        }
//        else if(n==0&&p>=1)
//        {
//            result=0;
//        }
//        else
//        {
//            for(int i=1;i<=p;i++)
//            {
//                result=result*n;
//            }
//        }
//        System.out.println(n+"^"+p+"="+result);


//        int row, col,i,j;
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter the number of rows");
//        row = in.nextInt();
//
//        System.out.println("Enter the number  columns");
//        col  = in.nextInt();
//
//        int mat1[][] = new int[row][col];
//        int mat2[][] = new int[row][col];
//        int res[][] = new int[row][col];
//
//        System.out.println("Enter the elements of matrix1");
//
//        for (  i= 0 ; i < row ; i++ )
//        {
//
//            for ( j= 0 ; j < col ;j++ )
//                mat1[i][j] = in.nextInt();
//
//        }
//        System.out.println("Enter the elements of  matrix2");
//
//
//        for (  i= 0 ; i < row ; i++ )
//        {
//
//            for ( j= 0 ; j < col ;j++ )
//                mat2[i][j] = in.nextInt();
//
//
//        }
//
//
//        for (  i= 0 ; i < row ; i++ )
//            for ( j= 0 ; j < col ;j++ )
//                res[i][j] =  mat1[i][j] - mat2[i][j]  ;
//
//        System.out.println("subtract  of  two matrices:-");
//
//        for (  i= 0 ; i < row ; i++ )
//        {
//            for ( j= 0 ; j < col ;j++ )
//                System.out.print(res[i][j]+"\t");
//
//            System.out.println();
//        }


//        long n1,n2;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter  number 1");
//        n1=sc.nextLong();
//        System.out.println("enter  number 2");
//        n2=sc.nextLong();
//        if(n1>0 && n2>0)
//        {
//            long result=gcdCal(n1,n2);
//            System.out.println("Gcd of two numbers = "+result);
//        }
//        else
//            System.out.println("Please enter numbers greater than zero");
//    }
//    static long gcdCal(long a,long b)
//    {
//        while (b > 0)
//        {
//            long temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;


//        long a,b,lcm;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter  number 1");
//        a=sc.nextLong();
//        System.out.println("enter  number 2");
//        b=sc.nextLong();
//        lcm=lcmCalculation(a,b);
//        System.out.println("LCM of "+a+" and "+b+" is ="+lcm);

//        int x1,x2,y1,y2;
//
//        double dis;
//
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("enter x1 point");
//
//        x1=sc.nextInt();
//
//        System.out.println("enter y1 point");
//
//        y1=sc.nextInt();
//
//        System.out.println("enter x2point");
//
//        x2=sc.nextInt();
//
//        System.out.println("enter y2 point");
//
//        y2=sc.nextInt();
//
//        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
//
//        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
//


//        long n,s;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number ");
//        n=sc.nextLong();
//        s=sum(n);
//        System.out.println("Sum of digits of a number is "+s);


//        long n,p;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number");
//        n=sc.nextLong();
//        p=perfectOrNot(n);
//        if(p==n)
//            System.out.println(n+" is a perfect number");
//        else
//            System.out.println(n+" is not a  perfect number");

//        long n,sum;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number ");
//        n=sc.nextLong();
//        for(sum=0 ;n!=0 ;n/=10)
//        {
//            sum+=n%10;
//        }
//        System.out.println("Sum of digits of a number is "+sum);

//        long n1,n2;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter  number 1");
//        n1=sc.nextLong();
//        System.out.println("Enter  number 2");
//        n2=sc.nextLong();
//        long result=hcfCal(n1,n2);
//        System.out.println("Hcf of two numbers = "+result);


//        Scanner s= new Scanner(System.in);
//        System.out.println("Enter the radius of cone:");
//        double r=s.nextDouble();
//        System.out.println("Enter the height of cone:");
//        double h=s.nextDouble();
//
//
//        double  volume=(22*r*r*h)/(3*7);
//
//        System.out.println("Volume Of Cone is:" +volume);


//        Scanner s= new Scanner(System.in);
//        System.out.println("Enter the radius of sphere:");
//        double r=s.nextDouble();
//
//
//
//        double  volume= (4*22*r*r*r)/(3*7);
//
//        System.out.println("Volume is:" +volume);

//
//        Scanner s= new Scanner(System.in);
//
//        System.out.println("Enter the height:");
//        double d1= s.nextDouble();
//        System.out.println("Enter the breadth:");
//        double d2= s.nextDouble();
//
//        double  area=(d1*d2) ;
//        System.out.println("Area of Parallelogram is: " + area);


//        Scanner s= new Scanner(System.in);
//
//        System.out.println("Enter the area of base:");
//        double base=s.nextDouble();
//        System.out.println("Enter the height:");
//        double height=s.nextDouble();

//        double  area=base*height ;
//        System.out.println("Volume Of Prism is: " + area);


//        double amount=0,principle=1000,rate=10,time=3,ci;
//
//        System.out.println("principle= "+principle);
//
//        System.out.println("rate="+rate);
//
//        System.out.println("time="+time);
//
//        amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
//
//        System.out.println("amount="+amount);
//
//        ci=amount-principle;
//
//        System.out.println("compound interest="+ci);

//        int i=100,arm;
//        System.out.println("Armstrong numbers between 100 to 999");
//        while(i<1000)
//        {
//            arm=armstrongOrNot(i);
//            if(arm==i)
//                System.out.println(i);
//            i++;
//        }


        Scanner scanner = new Scanner(System.in);



        System.out.println("Please enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        System.out.println("The inputs in sorted order are:");

//        if ((num1 < num2) && (num1 < num3)) {
//            System.out.println(num1);
//        } else if ((num2 < num1) && (num2 < num3)) {
//            System.out.println(num2);
//        } else if ((num3 < num1) && (num3 < num2)) {
//            System.out.println(num3);
//
//        }

//        if ((num1 != num2) && (num1 != num3)) {
//            System.out.println(num1);
//        } else if ((num2 != num1) && (num2!= num3)) {
//            System.out.println(num2);
//        } else if ((num3 !=  num1) && (num3 <=  num2)) {
//            System.out.println(num3);
//        }


        if ((num1 > num2) && (num1 > num3)) {
            System.out.println(num1);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println(num2);
        } else if ((num3 > num1) && (num3 > num2)) {
            System.out.println(num3);
        }

    }

    static int armstrongOrNot(int num)
    {
        int x,a=0;
        while(num!=0)
        {
            x=num%10;
            a=a+(x*x*x);
            num/=10 ;
        }
        return a;
    }

    public static void shortFizzBuzz() {
        for(int i=1; i < 101; i++) {
            System.out.println(i%15==0?"FizzBuzz":i%3==0?"Fizz":i%5==0?"Buzz":i);
        }
    }


    public static boolean fizzBuzz(int i)
    {

        for (i = 1; i <= 100; i++)
        {
            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("fizzbuzz");
            else if ((i % 5) == 0)
                System.out.println("fizz");
            else if ((i % 7) == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }
        return false;
    }


    static long hcfCal(long a,long b)
    { long temp;
        while (b > 0)
        {
            temp = b;
            b = a % b;
            a = temp;
        }
        return b;
    }

    static long perfectOrNot(long num)
    {
        long sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }

    static int sum(long num)
    {
        int sum=0;
        while(num!=0)
        {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }


    static long lcmCalculation(long n1,long n2)
    {
        long temp,i=2,res;
        if(n1>n2)
            res=n1;
        else
            res=n2;
        temp=res;
        while(res%n1!=0 || res%n2!=0)
        {
            res=temp*i;
            i++;
        }
        return res;

    }

    static void leapOrNot(long year)
    {
        if(year!=0)
        {
            if(year%400==0)
                System.out.println(year+" is a leap year");
            else  if(year%100==0)
                System.out.println(year+" is not a leap year");
            else if(year%4==0)
                System.out.println(year+" is a leap year");
            else
                System.out.println(year+" is not a leap year");
        }
        else
            System.out.println("Year zero does not exist ");
    }

    static String hexdecimal(int q)
    {
        char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        String hexdec="";
        while(q != 0)
        {
            rem=q%16;
            hexdec= a[rem] + hexdec;
            q= q/16;
        }
        return hexdec;
    }

    public static void Sort(int a[]) {
        int n = a.length, i, j, p, temp;
        for (i = 0; i < n - 1; i++) {
            p = i;
            for (j = i + 1; j < n; j++) {
                if (a[p] > a[j])
                    p = j;

            }
            temp = a[p];
            a[p] = a[i];
            a[i] = temp;

        }
    }

    public static void printarray(int a[])
    {
        for(int i=0; i < a.length; i++)
        {

            System.out.print(a[i]+" ");
        }

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



