import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        // Arithmetic methods tests
//        System.out.println(add(3,3));
//        System.out.println(subtract(10, 2));
//        System.out.println(multiply(5,3));
//        System.out.println(divide(20,4));
//        System.out.println(remainder(50, 7));
//
//        // getInteger test
//        int userInput = getInteger(1, 10);
//        System.out.println("Validated: " + userInput);

        // factorial test
        System.out.println("Factorial: " + getFactorial());
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static double multiply(double a, double b){
         return a * b;
    }

    public static double divide(double a, double b){
        return a / b;
    }

    public static int remainder(int a, int b){
        return a % b;
    }

    public static int getInteger(int min, int max) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userInput = in.nextInt();
        if (!(userInput >= min && userInput <= max)) {
            userInput = getInteger(min, max);
        }
        return userInput;
    }

    public static long getFactorial(){
        int userInput = getInteger(1,10);
        long factorial = 1;
        for(int i = 1; i <= userInput; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}