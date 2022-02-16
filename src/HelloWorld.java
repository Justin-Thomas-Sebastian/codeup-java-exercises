public class HelloWorld {
    public static void main(String[] args) {
        // HELLO WORLD EXERCISE
        // System.out.print("Hello, ");
        // System.out.print("World!");

        // SYNTAX, TYPES, AND VARIABLES EXERCISE
        // System.out.println(" "); // whitespace

        // 1. Create an int variable named myFavoriteNumber
        // and assign your favorite number to it, then print it out to the console.
        // int myFavoriteNumber = 28;
        // System.out.println(myFavoriteNumber);

        // 2. Create a String variable named myString
        // and assign a string value to it,
        // then print the variable out to the console.
        // String myString = "Justin";
        // System.out.println(myString);

        // 3. Change your code to assign a character value to myString. What do you notice?
        // String myString = 'C';   // Will not compile! Different data type

        // 4. Change your code to assign the value 3.14159 to myString. What happens?
        // String myString = 3.14259;  // Will not compile! Different data type

        // 5. Declare a long variable named myNumber,
        // but do not assign anything to it.
        // Next try to print out myNumber to the console. What happens?
        // long myNumber;
        // System.out.println(myNumber);  // Will not compile! Has to be initialized

        // 6. Change your code to assign the value 3.14 to myNumber. What do you notice?
        // long myNumber;
        // myNumber = 3.14;   // Will not compile! expecting long

        // 7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        // long myNumber = 123L;   // Specifying long type using L
        // System.out.println(myNumber);

        // 8. Change your code to assign the value 123 to myNumber.
        // Why does assigning the value 3.14 to a variable declared as a long not compile,
        // but assigning an integer value does?
        // long myNumber = 123;
        // Compiles because assigning a less precise data value to a variable whose type
        // is more precise is possible through implicit casting

        // 9. Change your code to declare myNumber as a float.
        // Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        // float myNumber = 3.14;  // Will not compile without F
        // float myNumber = 3.14F;  // 1st way
        // float myNumber = (float)3.14; // 2nd way

        // 10. Copy and paste the following code blocks one at a time and execute them
        // int x = 5;
        // System.out.println(x++);  // should be 5
        // System.out.println(x);    // should be 6

        // int x = 5;
        // System.out.println(++x);     // should be 6
        // System.out.println(x);       // should be 6
        // x++ prints value first before incrementing
        // ++x increments before printing value

        // 11. Try to create a variable named class. What happens?
        // String class = "adsf"; // Will not compile since class is a reserved keyword

        // 12. Object is the most generic type in Java.
        // You can assign any value to a variable of type Object.
        // What do you think will happen when the following code is run?
        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o;        // Results in run-time error since String cannot be cast to Integer
        // int three = (int) "three";  // Results in compile-time error since String cannot be cast to int
        // System.out.println(three);

        // 13. Rewrite the following expressions using
        // the relevant shorthand assignment operators:
        // int x = 4;
        // x = x + 5;   // before
        // x += 5;      // after

        // int x = 3;
        // int y = 4;
        // y = y * x;   // before
        // y *= x;      // after

        // int x = 10;
        // int y = 2;
        // x = x / y;  // before
        // x /= y;     // after
        // y = y - x;  // before
        // y -= x;     // after

        // 14. What happens if you assign a value to a numerical variable
        // that is larger (or smaller) than the type can hold?
        // int myInt = 2147483648; // Wont compile!. Goes past 2147483647 (int max)
        // int myInt = -2147483649; // Wont compile! Goes past -2147483648 (int min)

        // What happens if you increment a numeric variable past the type's capacity?
        // int myInt = 2147483647;  // int max
        // System.out.println("Before increment: " + myInt);
        // System.out.println("After increment: " + ++myInt);
    }
}