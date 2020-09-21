import java.io.*;

public class LineCount {

    private static int EOF = -1;
    private static File srcFile = null;
    private static String srcFilename = "<srcFilename>";

    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.out.println("Usage: linecount <src>\n");
            return;
        }

        if (args[0] != null) { // Check <src>
            srcFilename = args[0];
            System.out.println("linecount: srcFilename = " + srcFilename + "");
            srcFile = new File(srcFilename);
            if (!srcFile.canRead()) {
                System.out.println("linecount: Cannot open srcFile '" + srcFilename + "'");
                return;
            }
        } else {
            System.out.println("linecount: [OK] srcFilename = '" + srcFilename + "'");
        }

        final FileInputStream srcStream = new FileInputStream(srcFile);
        // Execute the character count.
        int c;
        int nLines = 0;

        while ((c = srcStream.read()) != EOF) {
            if (c == '\n')
                ++nLines;
        }

        srcStream.close();

        System.out.printf("%d line(s)\n", nLines);

    }

}
