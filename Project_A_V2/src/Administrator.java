import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * IAdministrator
 */
// public interface IAdministrator {

// }

class Administrator {

    static String[] commands = {"charcount", "copy", "linecount", "wordcount", "wc"};
    static String[] helpOption = {"-?", "-h", "-help"};
    static String[] verboseOption = {"-v", "-verbose"};
    static String[] bannerOption = {"-b", "-banner"};
    static String[][] options = {helpOption, verboseOption, bannerOption};


    // avoid switch, try to use OOP
    public static void administer(String[] arguments) {


        for (String argument : arguments) {
            System.out.println(argument);
        }

        if (containsRepetitions(arguments)) {
            System.out.println("Repetitions are not allowed");
            System.exit(0);
        }


        if (!isCommand(arguments[0])) {
            showCommands();
            System.exit(0);
        }

        if (arguments.length < 2 || arguments.length > 6) {
            showCommands();
            System.exit(0);
        }

        String command = arguments[0];
        Command op = new Command();


        Command.srcFile = arguments[1];

        ICommand cm = op.getCommand(command);

//        callOptions();

        cm.verbose();
        cm.process();


//        op.checkOptions();


    }


    static boolean isCommand(String strs) {

        return Arrays.asList(commands).contains(strs);
    }

    public static boolean containsRepetitions(String[] strs) {

        boolean contains = false;
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (i != j && strs[i].equals(strs[j])) {

                    contains = true;
                    break;
                }
            }
        }

        return contains;

    }

//    static void callOptions(Command cm, String[] strs) {
//
//
//
//
//    }

    static boolean isOption(String[] strs) {

        return isHelp(strs) && isVerbose(strs) && isBanner(strs);
    }

    static boolean isHelp(String[] strs) {

        boolean isHelp = false;
        for (String str : strs) {
            if (Arrays.asList(helpOption).contains(str)) {
                isHelp = true;
                break;
            }
        }
        return isHelp;
    }

    static boolean isVerbose(String[] strs) {

        boolean isVerbose = false;
        for (String str : strs) {
            if (Arrays.asList(verboseOption).contains(str)) {
                isVerbose = true;
                break;
            }
        }
        return isVerbose;
    }

    static boolean isBanner(String[] strs) {

        boolean isBanner = false;
        for (String str : strs) {
            if (Arrays.asList(bannerOption).contains(str)) {
                isBanner = true;
                break;
            }
        }
        return isBanner;
    }

    public static void showCommands() {

        System.out.println("\n");
        System.out.println("CharCount:\t" + "Usage: java CharCount.java <src>");
        System.out.println("Copy:\t\t" + "Usage: java Copy.java <src> <dst>");
        System.out.println("LineCount:\t" + "Usage: java LineCount.java <src>");
        System.out.println("WordCount:\t" + "Usage: java WordCount.java <src>");
        System.out.println("WC:\t\t" + "Usage: java WC.java <src> { <src> }");
        System.out.println("\n");

    }

}