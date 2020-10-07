
import java.util.Scanner;

class CharCount extends Counter implements ICounter {

    static int nChars = 0;

    @Override
    public void helper() {

        System.out.println("\n");

        System.out.println("CharCount:\t\t" + "Usage: charcount <src>");

        System.out.println("\n");

    }

    @Override
    public void verbose() {

        verboseIsActive = true;

    }

    @Override
    public void banner() {

        System.out.println("CharCount Version 1.0");
        bannerFooter();

    }

    @Override
    public void process() {


        Scanner sc = getScanner(srcFile);

        // Execute the character count.
        // in this program \n
        String chars;

        while (sc.hasNext()) {
            chars = sc.next();
//            System.out.println(chars);
            nChars += chars.length();
        }

        sc.close();

        System.out.printf("%d character(s)\n", nChars);

        checkOptions();





    }

    @Override
    public void printChars() {

        for (int n = 0; n < nChars; n++) {
            System.out.print("c");
        }
        System.out.println();


    }

    @Override
    public void checkOptions() {

        if (verboseIsActive) {
            this.printChars();
        }
        if (helperIsActive) {
            this.helper();
        }
        if (bannerIsActive) {
            this.banner();
        }

    }


}