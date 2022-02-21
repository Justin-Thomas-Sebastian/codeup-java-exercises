import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int attempts = 10;
        boolean isGuessing = true;
        int random = (int) (Math.random() * 100) + 1;

        System.out.println("Guessing Game.");
        while(isGuessing){
            if(attempts > 1){
                System.out.println(attempts + " attempts remaining.");
            } else {
                System.out.println("Last chance!");
            }

            int userInput = getInteger(1,100);
            if(userInput < random){
                System.out.println("HIGHER");
            } else if (userInput > random){
                System.out.println("LOWER");
            } else if (userInput == random){
                System.out.println("GOOD GUESS!");
                isGuessing = false;
            }

            attempts--;
            if(attempts == 0){
                System.out.println("Out of attempts. Game over.");
                isGuessing = false;
            }
            System.out.println(" ");
        }
    }

    // Validates user input is between a certain range
    public static int getInteger(int min, int max) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userInput = in.nextInt();
        if (!(userInput >= min && userInput <= max)) {
            System.out.println("Invalid input.");
            userInput = getInteger(min, max);
        }
        return userInput;
    }
}
