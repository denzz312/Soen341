/**
 Copy class and all required methods
 */
import java.io.*;
import java.util.Scanner;


public class Copy extends Command implements ICommand {

    int nChars = 0;

    public void helper() {

        System.out.println("\n");

        System.out.println("Copy:\t\t" + "Usage: copy <src> <dst>");

        System.out.println("\n");

    }

    public void verbose() {
        verboseIsActive = true;
    }

    public void banner() {

        System.out.println("Copy Version 1.0");
        bannerFooter();
    }

    @Override
    public void process() {

        Scanner sc = getScanner(srcFile);
        PrintWriter pw = getWriter(dstFile);

        // Execute the character count.
        String line;

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            pw.write(line + "\n");
            nChars += line.replace(" ", "").length();
        }

        sc.close();
        pw.close();

        checkOptions();

    }

    @Override
    public void printChars() {

        for (int i = 0; i < nChars; i++) {
            System.out.print(".");
        }
        System.out.println();


    }

    @Override
    public void checkOptions() {

        if (verboseIsActive) {
            this.printChars();
        }
        if (helperIsActive) {
            this.helper();
        }
        if (bannerIsActive) {
            this.banner();
        }

    }
}