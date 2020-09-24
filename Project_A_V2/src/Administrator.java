import java.io.*;

class Administrator {

    private static int EOF = -1;
    private static File srcFile = null;
    private static String srcFilename = "<srcFilename>";

    private static void helper() {

        System.out.println("\n");
        System.out.println("CharCount:\t" + "Usage: java CharCount.java <src>");
        System.out.println("Copy:\t\t" + "Usage: java Copy.java <src> <dst>");
        System.out.println("LineCount:\t" + "Usage: java LineCount.java <src>");
        System.out.println("WordCount:\t" + "Usage: java WordCount.java <src>");
        System.out.println("WC:\t\t" + "Usage: java WC.java <src> { <src> }");

        System.out.println("\n");

    }

    //avoid switch, try to use OOP
    public static void main(String[] args) {

        if (args.length != 1 || args.length!=2) {
            return;
        }



        switch (key) {
            case value:
                
                break;
        
            default:
                break;
        }
        
    }

    
}