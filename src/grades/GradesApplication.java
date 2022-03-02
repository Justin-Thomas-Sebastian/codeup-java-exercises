package grades;

import java.util.HashMap;
import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        Input in = new Input();
        HashMap<String, Student> students = new HashMap<>();
        Student s1 = new Student("Chris");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Marla");
        Student s4 = new Student("Sam");

        s1.addGrade(80);
        s1.addGrade(70);
        s1.addGrade(92);
        s2.addGrade(80);
        s2.addGrade(83);
        s2.addGrade(67);
        s3.addGrade(88);
        s3.addGrade(89);
        s3.addGrade(86);
        s4.addGrade(74);
        s4.addGrade(72);
        s4.addGrade(71);

        students.put("chris@github.com", s1);
        students.put("bob@github.com", s2);
        students.put("marla@github.com", s3);
        students.put("sam@github.com", s4);

        System.out.println("Welcome!");
        System.out.println("Here are the Github usernames of our students: ");
        for(String username : students.keySet()){
            System.out.println(" | " + username + " | ");
        }

        while(true){
            System.out.print("Select student: ");
            String userInputStr = in.getString();

            if(students.containsKey(userInputStr)){
                System.out.println("Retrieving info for " + userInputStr + "...");
                System.out.println("Name: " + students.get(userInputStr).getName());
                System.out.printf("Current Average: %.2f\n", students.get(userInputStr).getGradeAverage());
                System.out.println("Grades: " + students.get(userInputStr).getGrades());
            } else {
                System.out.println("Username not found.");
            }

            System.out.print("Would you like to see another student? (y/n): ");
            userInputStr = in.getString();
            if(!userInputStr.equalsIgnoreCase("Y")){
                System.out.println("Exiting...");
                return;
            }
        }
    }
}