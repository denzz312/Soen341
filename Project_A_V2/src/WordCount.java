import java.io.*;
import java.util.Scanner;


public class WordCount extends Counter implements ICounter {

    private static int EOF = -1;
    private static File srcFile = null;
    private static String srcFilename = "<srcFilename>";

    public static boolean isSpace(int c) {

        return (c == ' ' || c == '\t' || c =='\n');
    }

    public void helper() {

        System.out.println("WordCount Version 1.0\n" +
                "Copyright (C) ABC Inc 2020. All Rights Reserved. \n" +
                "Written by Deniz Dinchdonmez");

    }

    @Override
    public void verbose() {

        System.out.println("Not defined yet");

    }

    @Override
    public void banner() {

        System.out.println("WordCount Version 1.0\n" +
                "Copyright (C) ABC Inc 2020. All Rights Reserved. \n" +
                "Written by Deniz Dinchdonmez");

    }

    @Override
    public void count(String argument) {

        Scanner sc = getScanner(argument);
        String word = "";
        int nWords = 0;

        while (sc.hasNext()) {
            word = sc.next();
            System.out.println(word);
            nWords++;
        }

        sc.close();

        System.out.printf("%d word(s)\n", nWords);

    }


//    public static void main(String[] args) throws IOException {
//
//        if (args.length != 1) {
//            System.out.println("Usage: wordcount <src>\n");
//            return;
//        }
//
//        boolean isHelper = args[0].equals("-?") || args[0].equals("-h") || args[0].equals("-help");
////
////        if (isHelper) {
////            helper();
////            return;
////        }
//
//        if (args[0] != null) { // Check <src>
//            srcFilename = args[0];
//            System.out.println("wordcount: srcFilename = " + srcFilename + "");
//            srcFile = new File(srcFilename);
//            if (!srcFile.canRead()) {
//                System.out.println("wordcount: Cannot open srcFile '" + srcFilename + "'");
//                return;
//            }
//        } else {
//            System.out.println("wordcount: [OK] srcFilename = '" + srcFilename + "'");
//        }
//
//        final FileInputStream srcStream = new FileInputStream(srcFile);
//        // Execute the character count.
//        int c;
//        int nWords = 0;
//        boolean inWord = false;
//
//        while ((c = srcStream.read()) != EOF) {
//
//            if (!isSpace(c)) {
//                if (!inWord) {
//                    inWord = true;
//                    nWords++;
//                }
//            } else {
//                inWord = false;
//            }
//        }
//
//        srcStream.close();
//
//        System.out.printf("%d word(s)\n", nWords);
//
//    }

}
