// charcount.c - Count characters in a sourcefile

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * ICharCount
 */
interface ICharCount {
      void helper();

}

class CharCount implements ICharCount {

    private static int EOF = -1;
    private static File srcFile = null;
    private static String srcFilename = "<srcFilename>";



      public void helper() {

        System.out.println("\n");
        System.out.println("CharCount:\t" + "Usage: java CharCount.java <src>");
        System.out.println("Copy:\t\t" + "Usage: java Copy.java <src> <dst>");
        System.out.println("LineCount:\t" + "Usage: java LineCount.java <src>");
        System.out.println("WordCount:\t" + "Usage: java WordCount.java <src>");
        System.out.println("WC:\t\t" + "Usage: java WC.java <src> { <src> }");

        System.out.println("\n");

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