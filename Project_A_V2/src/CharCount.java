// charcount.c - Count characters in a sourcefile

import java.io.File;

/**
 * ICharCount
 */
interface ICharCount {

    void helper();

    void verbose();

    void banner();

}

class CharCount implements ICharCount {


    private static int EOF = -1;
    private static File srcFile;
//    private static String srcFilename = "<srcFilename>";

    public CharCount(File srcFile) {

        CharCount.srcFile = srcFile;

    }

    @Override
    public void helper() {

        System.out.println("\n");
        System.out.println("charcount:\t" + "Usage: charcount <src>");
//        System.out.println("Copy:\t\t" + "Usage: java Copy.java <src> <dst>");
//        System.out.println("LineCount:\t" + "Usage: java LineCount.java <src>");
//        System.out.println("WordCount:\t" + "Usage: java WordCount.java <src>");
//        System.out.println("WC:\t\t" + "Usage: java WC.java <src> { <src> }");

        System.out.println("\n");

    }

    @Override
    public void verbose() {

    }

    @Override
    public void banner() {

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