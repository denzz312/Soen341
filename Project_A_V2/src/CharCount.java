// charcount.c - Count characters in a sourcefile

import java.io.BufferedReader;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class CharCount extends Counter implements ICounter {

    static int nChars = 0;

    @Override
    public void helper() {

        System.out.println("CharCount Version 1.0\n" +
                "Copyright (C) ABC Inc 2020. All Rights Reserved. \n" +
                "Written by Deniz Dinchdonmez");

    }

    @Override
    public void verbose() {

        for (int n = 0; n < nChars; n++) {
            System.out.print("c");
        }
    }

    @Override
    public void banner() {

        System.out.println("CharCount Version 1.0\n" +
                "Copyright (C) ABC Inc 2020. All Rights Reserved. \n" +
                "Written by Deniz Dinchdonmez");

    }

    @Override
    public void count(String argument) {


        Scanner sc = getScanner(argument);

        // Execute the character count.
        String chars;

        while (sc.hasNext()) {
            chars = sc.next();
            System.out.println(chars);
            nChars+=chars.length();
        }

        sc.close();

        System.out.printf("%d characters\n", nChars);

    }



    //    public static void main(final String[] args) throws IOException {
//
//        if (args.length != 1) {
//            System.out.println("Usage: CharCount <src>\n");
//            return;
//        }
//
//        final boolean isHelper = args[0].equals("-?") || args[0].equals("-h") || args[0].equals("-help");
//
//        if (isHelper) {
//            helper();
//            return;
//        }
//
//        if (args[0] != null) { // Check <src>
//            srcFilename = args[0];
//            System.out.println("copy: srcFilename = '" + srcFilename + "'");
//            srcFile = new File(srcFilename);
//            if (!srcFile.canRead()) {
//                System.out.println("charcount: Cannot open srcFile '" + srcFilename + "'");
//                return;
//            }
//        } else {
//            System.out.println("charcount: [OK] srcFilename = '" + srcFilename + "'");
//        }
//
//        final FileInputStream srcStream = new FileInputStream(srcFile);
//
//        // Execute the character count.
//        int c;
//        int nChars = 0;
//
//        while ((c = srcStream.read()) != EOF) {
//            nChars++;
//        }
//
//        srcStream.close();
//
//        System.out.printf("%d characters\n", nChars);
//
//    }

}