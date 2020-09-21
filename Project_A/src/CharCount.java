// charcount.c - Count characters in a sourcefile

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class CharCount {

    private static int EOF = -1;
    private static File srcFile = null;
    private static String srcFilename = "<srcFilename>";

    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.out.println("Usage: charcount <src>\n");
            return;
        }

        if (args[0] != null) { // Check <src>
            srcFilename = args[0];
            System.out.println("copy: srcFilename = '" + srcFilename + "'");
            srcFile = new File(srcFilename);
            if (!srcFile.canRead()) {
                System.out.println("charcount: Cannot open srcFile '" + srcFilename + "'");
                return;
            }
        } else {
            System.out.println("charcount: [OK] srcFilename = '" + srcFilename + "'");
        }

        final FileInputStream srcStream = new FileInputStream(srcFile);

        // Execute the character count.
        int c;
        int nChars = 0;

        while ((c = srcStream.read()) != EOF) {
            nChars++;
        }

        srcStream.close();

        System.out.printf("%d characters\n", nChars);

    }

}