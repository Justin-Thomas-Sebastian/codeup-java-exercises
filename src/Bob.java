import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTalking = true;

        while(isTalking){
            String dialogueOption;
            System.out.print("Say something to Bob: ");
            dialogueOption = in.nextLine();
            bobResponse(dialogueOption);
            System.out.print("Continue Talking? y/n: ");
            dialogueOption = in.nextLine();
            if(dialogueOption.equalsIgnoreCase("n")){
                isTalking = false;
                System.out.println("Bye.");
            }
        }
    }

    public static void bobResponse(String myResponse){
        String bobResponse = "";
        if(myResponse.endsWith("?")){
            bobResponse = "Sure.";
        } else if (myResponse.endsWith("!")){
            bobResponse =  "Whoa, chill out!";
        } else if (myResponse.isEmpty()){
            bobResponse = "Fine. Be that way!";
        } else {
            bobResponse = "Whatever";
        }
        System.out.println("Bob: " + bobResponse);
    }
}
