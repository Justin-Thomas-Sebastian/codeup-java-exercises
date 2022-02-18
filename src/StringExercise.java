public class StringExercise {
    public static void main(String[] args){
        // String basics
        String pinkFloyd = "We don't need no education";
        System.out.print(pinkFloyd + "\n" + pinkFloyd.replace("education", "thought control"));

        String escapingQuotes = "\nCheck \"this\" out!, \"s inside of \"s!";
        System.out.println(escapingQuotes);

        String windows = "In windows, the main drive is usually C:\\";
        System.out.println(windows);

        String backlashes = "I can do backslashes \\, double backslashes \\\\, " +
            "\nand the amazing triple backslash \\\\\\!";
        System.out.println(backlashes);
    }
}
