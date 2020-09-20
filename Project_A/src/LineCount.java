import java.io.*;

public class LineCount {

    private static int EOF = -1;
    private static File srcFile = null;
    private static String srcFilename = "<srcFilename>";

    public static void main(String[] args) throws IOException {

        if ( args.length != 2 ) {
			System.out.println("Usage: linecount <src>\n");
			return;
        }
        
        if (args[1] != null) { // Check <src>
            srcFilename = args[1];
            System.out.println("linecount: srcFilename = "+ srcFilename + "");
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
        int nChars = 0;

        while ((c = srcStream.read()) != EOF) {
            nChars++;
        }

        srcStream.close();

        System.out.printf("%d characters\n", nChars);

    }
    





}
