/**
* this interface and class are used to create command objects
* */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

interface ICommand {

    void helper();

    void verbose();

    void banner();

    void process();

    void printChars();

    void checkOptions();

}

public class Command {

    static String srcFile;
    static String dstFile;
    boolean helperIsActive = false;
    boolean verboseIsActive = false;
    boolean bannerIsActive = false;


    public ICommand getCommand(String str) {

        if (str.equals("charcount")) {
            return new CharCount();
        } else if (str.equals("linecount")) {
            return new LineCount();
        } else if (str.equals("wordcount")) {
            return new WordCount();
        } else if (str.equals("copy")) {
            return new Copy();
        } else if (str.equals("wc")) {
            return new WCOO();
        }

        System.out.println("Please enter an allowed command");
        System.exit(0);
        return null;

    }

    Scanner getScanner(String file) {

        Scanner sc = null;
//        System.out.println("\nsrcFilename = '" + file + "'");
        try {
            sc = new Scanner(new File("src/" + file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sc;
    }

    PrintWriter getWriter(String destination){

        PrintWriter pw = null;
        try {
            pw = new PrintWriter("src/"+destination);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return pw;

    }



}
