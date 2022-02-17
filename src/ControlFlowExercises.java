import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // 1. LOOP BASICS
        // a. While
//        int i = 5;
//        while(i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }
//
        // b. Do While
//        int j = 0;
//        do{
//            System.out.println(j);
//            j += 2;
//        }while(j <= 100);

//        int j = 100;
//        do{
//            System.out.println(j);
//            j -= 5;
//        }while(j >= -5);

//        long j = 2;
//        do{
//            System.out.println(j);
//            j *= j;
//        }while(j <= 1000000);

//        // C. For Loop
//        for(int x = 5; x <= 15; x++ ){
//            System.out.print(x + " ");
//        }
//
//        for(long y = 2; y <= 1000000; y *= y){
//            System.out.println(y);
//        }

//        // FIZZ BUZZ
//        for(int i = 1; i <= 100; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        // TABLE OF POWERS
//        boolean displayTable = true;
//        while(displayTable){
//            Scanner in = new Scanner(System.in);
//            System.out.print("What number would you like to go up to? ");
//            int userInputNum = in.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for(int i = 1; i <= userInputNum; i++){
//                int square = (int) Math.pow(i, 2);
//                int cube = (int) Math.pow(i, 3);
//                System.out.printf("%-6s | %-7s | %-6s\n", i, square, cube);
//            }
//            System.out.print("Would you like to continue? Y/N: ");
//            String userInputStr = in.next();
//            if(userInputStr.equalsIgnoreCase("n")){
//                displayTable = false;
//                System.out.println("Exiting...");
//            }
//        }

        // GRADES CONVERSION
        Scanner in = new Scanner(System.in);
        boolean enterGrades = true;
        while(enterGrades){
            System.out.print("Enter numerical grade: ");
            int numberGrade = in.nextInt();
            if(numberGrade >= 97 && numberGrade <= 100){
                System.out.println("A+");
            } else if (numberGrade >= 93 && numberGrade <= 96){
                System.out.println("A");
            } else if (numberGrade >= 90 && numberGrade <= 92){
                System.out.println("A-");
            } else if (numberGrade >= 87 && numberGrade <= 89){
                System.out.println("B+");
            } else if (numberGrade >= 83 && numberGrade <= 86){
                System.out.println("B");
            } else if (numberGrade >= 80 && numberGrade <= 82){
                System.out.println("B-");
            } else if (numberGrade >= 77 && numberGrade <= 79){
                System.out.println("C+");
            } else if (numberGrade >= 73 && numberGrade <= 76){
                System.out.println("C");
            } else if (numberGrade >= 70 && numberGrade <= 72){
                System.out.println("C-");
            } else if (numberGrade >= 67 && numberGrade <= 69){
                System.out.println("D+");
            } else if (numberGrade >= 65 && numberGrade <= 66){
                System.out.println("D");
            } else if(numberGrade < 65){
                System.out.println("F");
            }

            System.out.print("Would you like to enter another grade? Y/N: ");
            String userInputStr = in.next();
            if(userInputStr.equalsIgnoreCase("n")){
                enterGrades = false;
                System.out.println("Exiting...");
            }
        }
   }
}
