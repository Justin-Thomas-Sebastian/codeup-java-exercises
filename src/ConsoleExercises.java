import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.\n", pi);

        // Explore the Scanner Class.
        // 1.
        Scanner in = new Scanner(System.in);
        int userInputNum;
        System.out.print("Enter an integer: ");
        userInputNum = in.nextInt();
        System.out.println("User entered: " + userInputNum);
        System.out.println(" ");
        in.nextLine();

        // 2.
        String userInputStr1, userInputStr2, userInputStr3;
        System.out.print("Enter 3 words: ");
        userInputStr1 = in.next();
        userInputStr2 = in.next();
        userInputStr3 = in.next();

        System.out.println("The user entered the following words: ");
        System.out.println("1. " + userInputStr1);
        System.out.println("2. " + userInputStr2);
        System.out.println("3. " + userInputStr3);
        System.out.println(" ");
        in.nextLine();

        // 3.
        //String userInputSentence;
        //System.out.print("Enter a sentence: ");
        //userInputSentence = in.next();
        //System.out.println("Sentence: " + userInputSentence);

        // 4.
        String userInputSentence;
        System.out.print("Enter a sentence: ");
        userInputSentence = in.nextLine();
        System.out.println("Sentence: " + userInputSentence);
        System.out.println(" ");

        // Calculate the perimeter and area of Codeup's classrooms.
        String lengthStr, widthStr;
        int lengthInt, widthInt;
        System.out.print("Enter length: ");
        lengthStr = in.nextLine();
        System.out.print("Enter width: ");
        widthStr = in.nextLine();

        lengthInt = Integer.parseInt(lengthStr);
        widthInt = Integer.parseInt(widthStr);
        int perimeter = (lengthInt * 2) + (widthInt * 2);
        int area = lengthInt * widthInt;
        System.out.printf("Perimeter: %d\n" , perimeter);
        System.out.printf("Area: %d\n", area);
        System.out.println(" ");

        // BONUS
        System.out.println("BONUS SECTION");
        in.useDelimiter("\n");
        double length, width, height;
        System.out.print("Enter length: ");
        length = in.nextDouble();
        System.out.print("Enter width: ");
        width = in.nextDouble();
        System.out.print("Enter height: ");
        height = in.nextDouble();

        double perimeterBonus = (length * 2) + (width * 2);
        double areaBonus = length * width;
        double volumeBonus = length * width * height;

        System.out.printf("Perimeter: %.2f\n", perimeterBonus);
        System.out.printf("Area: %.2f\n", areaBonus);
        System.out.printf("Volume: %.2f\n", volumeBonus);
    }
}
