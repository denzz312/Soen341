import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

interface ICounter {


    void helper();

    void verbose();

    void banner();

    void count(String args);

}

public class Counter {

    Scanner getScanner(String file) {

        Scanner sc = null;
        System.out.println("srcFilename = '" + file + "'");
        try {
            sc = new Scanner(new File("src/" + file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sc;
    }
}



