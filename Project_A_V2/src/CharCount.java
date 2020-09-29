// charcount.c - Count characters in a sourcefile

import java.io.File;

class CharCount implements ICounter {


    private static int EOF = -1;
    private static File srcFile;
//    private static String srcFilename = "<srcFilename>";

//    public CharCount(File srcFile) {
//
//        CharCount.srcFile = srcFile;
//
//    }

    @Override
    public void helper() {

        System.out.println("CharCount Version 1.0\n" +
                "Copyright (C) ABC Inc 2020. All Rights Reserved. \n" +
                "Written by Deniz Dinchdonmez");

    }

    @Override
    public void verbose() {

        System.out.println("Not defined yet");

    }

    @Override
    public void banner() {

        System.out.println("CharCount Version 1.0\n" +
                "Copyright (C) ABC Inc 2020. All Rights Reserved. \n" +
                "Written by Deniz Dinchdonmez");

    }

    @Override
    public void function(String[] args) {

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