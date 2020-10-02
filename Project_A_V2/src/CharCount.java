
import java.util.Scanner;

class CharCount extends Counter implements ICounter {

    static int nChars = 0;

    @Override
    public void helper() {

        System.out.println("CharCount Version 1.0\n" +
                "Copyright (C) ABC Inc 2020. All Rights Reserved. \n" +
                "Written by Deniz Dinchdonmez");

    }

    @Override
    public void verbose() {

        for (int n = 0; n < nChars; n++) {
            System.out.print("c");
        }
    }

    @Override
    public void banner() {

        System.out.println("CharCount Version 1.0\n" +
                "Copyright (C) ABC Inc 2020. All Rights Reserved. \n" +
                "Written by Deniz Dinchdonmez");

    }

    @Override
    public void process() {


        Scanner sc = getScanner(srcFile);

        // Execute the character count.
        String chars;

        while (sc.hasNext()) {
            chars = sc.next();
            System.out.println(chars);
            nChars += chars.length();
        }

        sc.close();

        System.out.printf("%d characters\n", nChars);

    }

}