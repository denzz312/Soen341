import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class LineCount extends Counter implements ICounter {

    private static int EOF = -1;
    private static String srcFilename = "<srcFilename>";

    public void helper() {

        System.out.println("\n");

        System.out.println("LineCount:\t" + "Usage: java LineCount.java <src>");

        System.out.println("\n");

    }

    @Override
    public void verbose() {

        System.out.println("Not defined yet");

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
        int nLines = 0;

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            System.out.println(line);
            nLines++;
        }

        sc.close();

        System.out.printf("%d line(s)\n", nLines);


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
