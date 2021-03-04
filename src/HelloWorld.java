public class HelloWorld {
    public static void main(String[] args) {
//        System.out.print("Hello");
//        System.out.print("World!");

        int myFavoriteNumber = 80;
        System.out.println(myFavoriteNumber);

        String myString = "This is a string";
        System.out.println(myString);

        myString = "New string";
        System.out.println(myString);

//        char myString = "newSting";
//        System.out.println(myString);
//        it says my string variable is already declared.

//        Double cannot be converted to string
//        myString = 3.14159;
//        System.out.println(myString);

        long myNumber;
//        myNumber = 3.14;
        myNumber = 123;
        System.out.println(myNumber);
//      myNumber might not have been initialized when I just long myNumber without anything
//      When I assign 3.14 to myNumber it says incompatible types: possible lossy conversion from double to long
//      When I assign 123L to myNumber it will return 123 back to me.
//      When I assign 123 to myNumber it will return 123 back to me.


//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//        Because long long take whole numbers not doubles

//        float myNumber = 3.14F;
//        float myNumber = (float) 3.14;
//        One way to fix it is to put the letter F at the end of the number. or do the casting way to do it.


//
//        int x = 5;
//        System.out.println(x++); // output is 5:  x++ means post increment we use x++ in our statement if we want to use the current value, and then we want to increment the value of i by 1.
//        System.out.println(x);   // output is 6:  this is why we see 5 on the first log and then 6 on the second log.


//        int x = 5;
//        System.out.println(++x); // output is 6:  ++x means pre increment We use ++x in our statement if we want to increment the value of i by 1 and then use it in our statement.
//        System.out.println(x);   // output is 6:  this is why we see 6 on the first log and 6 on the second log too.

//        var class = "hello";
//      can't use class as a variable, it will say it's not a statement.


//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);


//        Number 10
//      I expected it to not run without a system.out at first, next I didn't know what to expect. it give me string can't not be cast to integer.

//        int three = (int) "three";

//        Number 12
//      The difference between this one and the one above is that instead of having to make a string variable and a int, this one just have both in one function. the output is the same.

//        int x = 4;
//        x = x + 5;

//        Number 13
//        shorthand way of the function above
//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;

//        shorthand way of the function above
//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

//      shorthand way of the function above
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        System.out.println(y);


//        Number 14
//        int number = Integer.MAX_VALUE;
//        System.out.println(++number);
//      doesn't matter if I use max or min. it will return -2147483648 back to me.

    }
}
