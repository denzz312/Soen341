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


        if (!isCommand(arguments[0])) {
            showCommands();
        }

        if(arguments.length<2 || arguments.length>6){
            showCommands();
            System.exit(0);
        }

        String command = arguments[0];

        Option op = new Option();
        ICounter count = op.getOption(command);

        count.count(arguments[1]);


    }

    static boolean isCommand(String strs){

        return Arrays.asList(commands).contains(strs);
    }

    static boolean isHelp(String[] strs){

        boolean isHelp = false;
        for (String str : strs) {
            if (Arrays.asList(helpOption).contains(str)) {
                isHelp = true;
                break;
            }
        }
        return isHelp;
    }

    static boolean isVerbose(String[] strs){

        boolean isVerbose = false;
        for (String str : strs) {
            if (Arrays.asList(verboseOption).contains(str)) {
                isVerbose = true;
                break;
            }
        }
        return isVerbose;
    }

    static boolean isBanner(String[] strs){

        boolean isBanner = false;
        for (String str : strs) {
            if (Arrays.asList(bannerOption).contains(str)) {
                isBanner = true;
                break;
            }
        }
        return isBanner;
    }

    public static void showCommands(){

        System.out.println("\n");
        System.out.println("CharCount:\t" + "Usage: java CharCount.java <src>");
        System.out.println("Copy:\t\t" + "Usage: java Copy.java <src> <dst>");
        System.out.println("LineCount:\t" + "Usage: java LineCount.java <src>");
        System.out.println("WordCount:\t" + "Usage: java WordCount.java <src>");
        System.out.println("WC:\t\t" + "Usage: java WC.java <src> { <src> }");
        System.out.println("\n");

    }

}