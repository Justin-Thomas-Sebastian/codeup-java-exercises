package util;

import java.util.Scanner;

public class Input {
    private Scanner in;

    public Input(){
        this.in = new Scanner(System.in);
    }

    public String getString(){
        return in.nextLine();
    }

    public boolean yesNo(){
        System.out.print("Validate yes or no: ");
        String userInput = this.getString();
        if(userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("YES")){
            return true;
        } else {
            return false;
        }
    }

    // getInt() with parameters
    public int getInt(int min, int max){
        System.out.print("Enter number between " + min + " and " + max + ": ");
        int userInput = Integer.parseInt(this.getString());
        if(!(userInput >= min && userInput <= max)){
            userInput = getInt(min, max);
        }
        return userInput;
    }

    // getInt() without parameters
    public int getInt(){
        int min = 0;
        int max = 1000;
        return getInt(min, max);
    }

    // getDouble with parameters
    public double getDouble(double min, double max){
        System.out.print("Enter number between " + min + " and " + max + ": ");
        double userInput = Double.parseDouble(this.getString());
        if(!(userInput >= min && userInput <= max)){
            userInput = getDouble(min, max);
        }
        return userInput;
    }

    // getDouble without parameters
    public double getDouble(){
        double min = 0.01;
        double max = 1_000_000.01;
        return getDouble(min, max);
    }
}

