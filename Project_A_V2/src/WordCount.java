/**
 Wordcount class and all required methods
 */
import java.util.Scanner;


public class WordCount extends Counter implements ICounter {

    int nWords = 0;


    public void helper() {

        System.out.println("\n");

        System.out.println("WordCount:\t\t" + "Usage: wordcount <src>");

        System.out.println("\n");

    }

    @Override
    public void verbose() {

        verboseIsActive = true;

    }

    @Override
    public void banner() {

        System.out.println("WordCount Version 1.0");
        bannerFooter();

    }


    @Override
    public void process() {

        Scanner sc = getScanner(srcFile);
        String word = "";

        while (sc.hasNext()) {
            word = sc.next();
//            System.out.println(word);
            nWords++;
        }

        sc.close();

        System.out.printf("%d word(s)\n", nWords);

        checkOptions();



//        if(verboseIsActive)
//            printChars();

    }


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


    public void printChars(){
        for (int i = 0; i < nWords; i++) {
            System.out.print("w");
        }
        System.out.println();

    }

}
