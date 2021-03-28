package seedu.duke;

public class Constants {
    public static final String ADD_INFO_MESSAGE = "Add a patient to the list\n"
            + "Command prefix: add\n"
            + "Argument(s): IC number\n"
            + "Usage: add /<IC_NUMBER>\n"
            + "Example: add S1234567D\n";
    public static final String LIST_INFO_MESSAGE = "Show the list of all patients\n"
            + "Usage: list\n";
    public static final String LOAD_INFO_MESSAGE = "Select a specified patient to add and retrieve records\n"
            + "Command prefix: load\n"
            + "Arguments(s): IC number\n"
            + "Usage: load <IC_NUMBER>\n"
            + "Example: load S1234567D\n";
    public static final String RECORD_CONSULTATION_INFO_MESSAGE = "Add a consultation record to the selected patient\n"
            + "Command prefix: record\n"
            + "Arguments(s): consultation details\n"
            + "Usage: record <CONSULTATION DETAILS>\n"
            + "Example: record fever\n";
    public static final String RETRIEVE_INFO_MESSAGE = "Retrieve past consultation record from the selected patient\n"
            + "Usage: retrieve\n";
    public static final String CURRENT_INFO_MESSAGE = "Print out the current patient being loaded.\n"
            + "Usage: current\n";
    public static final String HELP_INFO_MESSAGE = "Display information about all commands or selected commands only\n"
            + "Command prefix: help\n"
            + "Argument(s): commands (optional)\n"
            + "Usage: help <OPTIONAL COMMANDS>\n"
            + "Example: help list add\n";
    public static final String EXIT_INFO_MESSAGE = "Exit the program\n"
            + "Usage: exit\n";

    public static final String INVALID_COMMAND_MESSAGE = "Invalid command: %s";
    public static final String EXIT_MESSAGE = "Goodbye, we hope to see you again!";
    public static final String WELCOME_MESSAGE = "Welcome to the Patient Manager.\n";
    public static final String INPUT_PROMPT = "Please input a command: ";

    public static final String LONG_LINE = "----------------------------------------------------------------------";

    // Exception messages
    public static final String EXCEPTION_PARSER_EMPTYSTRING = "Empty string is found when trying to parse command";
    public static final String EXCEPTION_PARSER_INVALIDCOMMAND = "Invalid command is provided";
    public static final String EXCEPTION_ADD_INVALIDNRIC = "Please key in a valid NRIC number!";
    public static final String EXCEPTION_ADD_PATIENTEXISTS = "Patient already exists!";
    public static final String EXCEPTION_LIST_EMPTY = "List is currently empty!";
    public static final String EXCEPTION_RECORD_RETRIEVE_NULLPATIENT = "No patient loaded!";
    public static final String EXCEPTION_RECORD_EMPTYPAYLOAD = "Please give me more details about the patient's visit";

    // Number constants
    public static final int ID_NUMBER_OF_CHARACTERS = 9;
    public static final int INDEX_OF_FIRST_CHARACTER = 0;
    public static final int INDEX_OF_LAST_CHARACTER = 8;

    //Storage delimiter constants
    public static final String IC_SEPARATOR = "||";
    public static final String DATE_SEPARATOR = "|~|";
    public static final String SYMPTOMS_SEPARATOR = "|s|";
    public static final String DIAGNOSIS_SEPARATOR = "|d|";
    public static final String PRESCRIPTION_SEPARATOR = "|p|";
}
