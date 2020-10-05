import java.io.*;
import java.util.Scanner;


public class WordCount extends Counter implements ICounter {

    int nWords = 0;

    public static boolean isSpace(int c) {

        return (c == ' ' || c == '\t' || c == '\n');
    }

    public void helper() {

        System.out.println("WordCount Version 1.0\n" +
                "Copyright (C) ABC Inc 2020. All Rights Reserved. \n" +
                "Written by Deniz Dinchdonmez");

    }

    @Override
    public void verbose() {

        verboseIsActive = true;

    }

    @Override
    public void banner() {

        System.out.println("WordCount Version 1.0\n" +
                "Copyright (C) ABC Inc 2020. All Rights Reserved. \n" +
                "Written by Deniz Dinchdonmez");

    }


    @Override
    public void process() {

        Scanner sc = getScanner(srcFile);
        String word = "";

        while (sc.hasNext()) {
            word = sc.next();
//            System.out.println(word);
            nWords++;
        }

        sc.close();

        System.out.printf("%d word(s)\n", nWords);

        checkOptions();



//        if(verboseIsActive)
//            printChars();

    }


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


    public void printChars(){
        for (int i = 0; i < nWords; i++) {
            System.out.print("w");
        }
    }

}
