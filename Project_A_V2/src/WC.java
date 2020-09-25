import java.io.*;

/**
 * IWC
 */
public interface IWC {

    
}

public class WC {

    private static int EOF = -1;
    private static File srcFile = null;
    private static String srcFilename = "<srcFilename>";

    public static boolean isSpace(final int c) {
        return (c == ' ' || c == '\t');
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

        int totalLines = 0;
        int totalWords = 0;
        int totalChars = 0;

        boolean isHelper = args[0].equals("-?") || args[0].equals("-h") || args[0].equals("-help");

        if (isHelper) {
            helper();
            return;
        }

        if (args.length < 2) {
            System.out.println("Usage: WC <src> { <src> }\n");
            return;
        }

        for (int i = 0; i < args.length; i++) {

            if (args[i] != null) { // Check <src>
                srcFilename = args[i];
                System.out.println("wc: srcFilename = " + srcFilename + "");
                srcFile = new File(srcFilename);
                if (!srcFile.canRead()) {
                    System.out.println("wc: Cannot open srcFile '" + srcFilename + "'");
                    return;
                }
            } else {
                System.out.println("wc: [OK] srcFilename = '" + srcFilename + "'");
            }

            final FileInputStream srcStream = new FileInputStream(srcFile);

            int c;
            int nChars, nLines, nWords;
            boolean inWord = false;
            nChars = nLines = nWords = 0;

            while ((c = srcStream.read()) != EOF) {

                // Count characters.
                nChars++;

                // Count lines.
                if (c == '\n')
                    ++nLines;

                // Count words.
                if (!isSpace(c)) {

                    if (!inWord) {

                        inWord = true;
                        ++nWords;
                    }

                } else {

                    inWord = false;

                }

            }

            srcStream.close();

            // Print the result of the source file.
            System.out.printf("%s: %d lines, %d words, %d chars\n", srcFilename, nLines, nWords, nChars);

            totalLines += nLines;
            totalWords += nWords;
            totalChars += nChars;

        }

        if (args.length > 2) {
            System.out.printf("**Total: %d lines, %d words, %d chars\n", totalLines, totalWords, totalChars);
        }
        return;

    }
}
