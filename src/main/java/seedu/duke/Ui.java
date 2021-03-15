package seedu.duke;

import java.util.Scanner;

/**
 * This class handles all UI-related functions.
 */
public class Ui {
    private Scanner userInputScanner;
    public static final String WELCOME_MESSAGE = "Welcome to the Patient Manager.\n";
    public static final String INPUT_PROMPT = "Please input a command:";

    /**
     * Initialize a UI handler.
     */
    public Ui() {
        userInputScanner = new Scanner(System.in);
    }

    /**
     * Returns user input as a String.
     * @return user input
     */
    public String readInput() {
        return userInputScanner.nextLine();
    }

    /**
     * Closes scanner.
     */
    public void closeScanner() {
        userInputScanner.close();
    }

    /**
     * Prints the String specified in @param.
     * @param message String to be printed
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Prints a welcome message.
     */
    public void printWelcome() {
        printMessage(WELCOME_MESSAGE);
        printMessage(INPUT_PROMPT);
    }

    /**
     * Prints the exception message specified in @param.
     * @param e Exception to be printed
     */
    public void printException(Exception e) {
        printMessage(e.toString());
    }

}
