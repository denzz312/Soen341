/**
 LineCount class and all required methods
 */
import java.util.Scanner;


public class LineCount extends Counter implements ICounter {


    static int nLines = 0;

    public void helper() {

        System.out.println("\n");

        System.out.println("LineCount:\t" + "Usage: jlinecount <src>");

        System.out.println("\n");

    }

    @Override
    public void verbose() {

        verboseIsActive = true;

    }

    @Override
    public void banner() {

        System.out.println("LineCount Version 1.0\n" +
                "Copyright (C) ABC Inc 2020. All Rights Reserved. \n" +
                "Written by Deniz Dinchdonmez");

    }

    @Override
    public void process() {

        Scanner sc = getScanner(srcFile);
        String line = "";

        while (sc.hasNextLine()) {
            line = sc.nextLine();
//            System.out.println(line);
            nLines++;
        }

        sc.close();

        System.out.printf("%d line(s)\n", nLines);

        checkOptions();


    }

    @Override
    public void printChars() {
        for (int i = 0; i < nLines; i++) {
            System.out.print("l");
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
