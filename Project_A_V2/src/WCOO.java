/**
 WCOO class and all required methods. This class just creates and calls methods from other 3 classes
 */
public class WCOO extends Counter implements ICounter {


    WordCount w = new WordCount();
    CharCount c = new CharCount();
    LineCount l = new LineCount();

    public void helper() {

        System.out.println("\n");

        System.out.println("WC:\t" + "wc <src> { <src> }");

        System.out.println("\n");

    }

    @Override
    public void verbose() {

        w.verbose();
        c.verbose();
        l.verbose();

    }

    @Override
    public void banner() {

        System.out.println("WC Version 1.0\n" +
                "Copyright (C) ABC Inc 2020. All Rights Reserved. \n" +
                "Written by Deniz Dinchdonmez");

    }

    @Override
    public void process() {

        w.process();
        c.process();
        l.process();
    }

    @Override
    public void printChars() {

        w.printChars();
        c.printChars();
        l.printChars();

    }

    @Override
    public void checkOptions() {

    }

}
