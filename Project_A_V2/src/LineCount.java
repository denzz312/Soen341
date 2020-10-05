import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class LineCount extends Counter implements ICounter {


    static int nLines = 0;

    public void helper() {

        System.out.println("\n");

        System.out.println("LineCount:\t" + "Usage: java LineCount.java <src>");

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


//    public static void main(String[] args) throws IOException {
//
//        if (args.length != 1) {
//            System.out.println("Usage: linecount <src>\n");
//            return;
//        }
//
//        boolean isHelper = args[0].equals("-?") || args[0].equals("-h") || args[0].equals("-help");
//
////        if (isHelper) {
////            helper();
////            return;
////        }
//
//        if (args[0] != null) { // Check <src>
//            srcFilename = args[0];
//            System.out.println("linecount: srcFilename = " + srcFilename + "");
//            srcFile = new File(srcFilename);
//            if (!srcFile.canRead()) {
//                System.out.println("linecount: Cannot open srcFile '" + srcFilename + "'");
//                return;
//            }
//        } else {
//            System.out.println("linecount: [OK] srcFilename = '" + srcFilename + "'");
//        }
//
//        final FileInputStream srcStream = new FileInputStream(srcFile);
//        // Execute the character count.
//        int c;
//        int nLines = 1;
//
//        while ((c = srcStream.read()) != EOF) {
//            if (c == '\n')
//                ++nLines;
//        }
//
//        srcStream.close();
//
//        System.out.printf("%d line(s)\n", nLines);
//
//    }

}
