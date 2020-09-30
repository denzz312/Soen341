
import java.io.*;
import java.util.Scanner;



public class Copy {
    private static int EOF = -1;
    private static File srcFile = null;
    private static File dstFile = null;
    private static String srcFilename = "<srcFilename>";
    private static String dstFilename = "<dstFilename>";

    public void helper() {

        System.out.println("\n");

        System.out.println("Copy:\t\t" + "Usage: java Copy.java <src> <dst>");

        System.out.println("\n");

    }

    public void verbose() {

        System.out.println("hmmmm");

    }

    public void banner() {

        System.out.println("Copy Version 1.0\n" +
                        "Copyright (C) ABC Inc 2020. All Rights Reserved. \n" +
                        "Written by Deniz Dinchdonmez");
    }

    public void function(String[] args) {

    }


//    public static void main(final String args[]) throws IOException {
//
//        // Check the number of arguments.
//        // In Java, the command name 'copy' is considered as an argument.
//
//        boolean isHelper = args[0].equals("-?") || args[0].equals("-h") || args[0].equals("-help");
//
////        if (isHelper) {
////            helper();
////            return;
////        }
//
//        if (args.length != 2) {
//            System.out.println("Usage: copy <src> <dst>");
//            return;
//        }
//
//        // Check if arguments are valid, if the srcFile exists, and if can create the
//        // dstFile.
//        if (args[0] != null) { // Check <src>
//            srcFilename = args[0];
//            System.out.println("copy: srcFilename = '" + srcFilename + "'");
//            srcFile = new File(srcFilename);
//            if (!srcFile.canRead()) {
//                System.out.println("copy: Cannot open srcFile '" + srcFilename + "'");
//                return;
//            }
//        } else {
//            System.out.println("copy: [OK] srcFilename = '" + srcFilename + "'");
//        }
//
//        if (args[1] != null) { // Check <dst>
//            dstFilename = args[1];
//            dstFile = new File(dstFilename);
//        } else {
//            System.out.println("copy: [OK] dstFilename = '" + dstFilename + "'");
//        }
//
//        final FileInputStream srcStream = new FileInputStream(srcFile);
//        final FileOutputStream dstStream = new FileOutputStream(dstFile);
//
//        // Execute the copy.
//        int c;
//
//        while ((c = srcStream.read()) != EOF) {
//            dstStream.write(c);
//            System.out.print('.');
//        }
//
//        // Close and flush all the files.
//        srcStream.close();
//        dstStream.close();
//
//        System.out.println("copy: done.");
//    }
}
