import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

interface ICounter extends ICommand {

    void count(String args);

}

public class Counter extends Command {

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



