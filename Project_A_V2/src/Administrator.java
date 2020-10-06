
/**
 * This class is used to parse the arguments and call required functions
 */
import java.util.Arrays;



class Administrator {

    static String[] commands = {"charcount", "copy", "linecount", "wordcount", "wc"};
    static String[] helpOption = {"-?", "-h", "-help"};
    static String[] verboseOption = {"-v", "-verbose"};
    static String[] bannerOption = {"-b", "-banner"};
    static String[][] options = {helpOption, verboseOption, bannerOption};


    // avoid switch, try to use OOP
    public static void administer(String[] arguments) {


//        for (String argument : arguments) {
//            System.out.println(argument);
//        }

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
        ICommand cm = op.getCommand(command);


        int source = -1;

        Command.srcFile = arguments[1];

        for (int i = 1; i < arguments.length; i++) {
            if (arguments[i].contains(".txt")) {
                Command.srcFile = arguments[i];
                source = i;
                break;
            }
        }


        if (command.equals("copy") && source!=-1) {
            if (arguments[source].contains(".txt") && arguments[source + 1].contains(".txt")) {
                Command.dstFile = arguments[source + 1];
            }else {
                System.out.println("For the copy command a source file and a destination file must be consecutive");
            }
        }

        checkOptions(cm, arguments);

        if (hasTxt(arguments))
        cm.process();


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

    static void checkOptions(ICommand cm, String[] strs) {

        if (isHelp(strs)) {
            cm.helper();
        }
        if (isVerbose(strs)) {
            if (!hasTxt(strs)) {

                System.out.println("To activate verbose there should be a source file");
                showCommands();
                System.exit(0);

            }
            cm.verbose();
        }
        if (isBanner(strs)) {
            cm.banner();
        }


    }

    static void callOptions(Command cm, String str) {


    }

    static boolean isOption(String[] strs) {

        return isHelp(strs) || isVerbose(strs) || isBanner(strs);
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

    static boolean hasTxt(String[] strs) {
        boolean hasTxt = false;


        for (int i = 1; i < strs.length; i++) {
            if (strs[i].contains(".txt")) {
                hasTxt = true;
                break;

            }
        }


        return hasTxt;
    }

    static boolean isVerbose(String[] strs) {

        boolean isVerbose = false;
        boolean hasTxt = false;
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
        System.out.println("CharCount:\t" + "Usage: charcount <src>");
        System.out.println("Copy:\t\t" + "Usage: copy <src> <dst>");
        System.out.println("LineCount:\t" + "Usage: linecount <src>");
        System.out.println("WordCount:\t" + "Usage: wordcount <src>");
        System.out.println("WC:\t\t\t" + "Usage: wc <src> { <src> }");
        System.out.println("\n");

    }

}