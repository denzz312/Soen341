import java.io.*;

/**
 * ILineCount
 */
interface ILineCount {


    void helper();

    void verbose();

    void banner();

    
}

public class LineCount implements ILineCount {

    private static int EOF = -1;
    private static File srcFile = null;
    private static String srcFilename = "<srcFilename>";

    public void helper() {

        System.out.println("\n");

        System.out.println("LineCount:\t" + "Usage: java LineCount.java <src>");

        System.out.println("\n");

    }

    @Override
    public void verbose() {

    }

    @Override
    public void banner() {

    }

    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.out.println("Usage: linecount <src>\n");
            return;
        }

        boolean isHelper = args[0].equals("-?") || args[0].equals("-h") || args[0].equals("-help");

//        if (isHelper) {
//            helper();
//            return;
//        }

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
        int nLines = 1;

        while ((c = srcStream.read()) != EOF) {
            if (c == '\n')
                ++nLines;
        }

        srcStream.close();

        System.out.printf("%d line(s)\n", nLines);

    }

}
