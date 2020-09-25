import java.io.*;

public class WordCount {

    private static int EOF = -1;
    private static File srcFile = null;
    private static String srcFilename = "<srcFilename>";

    public static boolean isSpace(final int c) {

        return (c == ' ' || c == '\t' || c=='\n');
    }

    private static void helper() {

        System.out.println("\n");
        System.out.println("CharCount:\t" + "Usage: java CharCount.java <src>");
        System.out.println("Copy:\t\t" + "Usage: java Copy.java <src> <dst>");
        System.out.println("LineCount:\t" + "Usage: java LineCount.java <src>");
        System.out.println("WordCount:\t" + "Usage: java WordCount.java <src>");
        System.out.println("WC:\t\t" + "Usage: java WC.java <src> { <src> }");
        System.out.println("\n");

    }

    public static void main(final String[] args) throws IOException {

        if (args.length != 1) {
            System.out.println("Usage: wordcount <src>\n");
            return;
        }

        final boolean isHelper = args[0].equals("-?") || args[0].equals("-h") || args[0].equals("-help");

        if (isHelper) {
            helper();
            return;
        }

        if (args[0] != null) { // Check <src>
            srcFilename = args[0];
            System.out.println("wordcount: srcFilename = " + srcFilename + "");
            srcFile = new File(srcFilename);
            if (!srcFile.canRead()) {
                System.out.println("wordcount: Cannot open srcFile '" + srcFilename + "'");
                return;
            }
        } else {
            System.out.println("wordcount: [OK] srcFilename = '" + srcFilename + "'");
        }

        final FileInputStream srcStream = new FileInputStream(srcFile);
        // Execute the character count.
        int c;
        int nWords = 0;
        boolean inWord = false;

        while ((c = srcStream.read()) != EOF) {

            if (!isSpace(c)) {
                if (!inWord) {
                    inWord = true;
                    nWords++;
                }
            } else {
                inWord = false;
            }
        }

        srcStream.close();

        System.out.printf("%d word(s)\n", nWords);

    }

}
