import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * IAdministrator
 */
// public interface IAdministrator {

// }

class Administrator {


    // avoid switch, try to use OOP
    public static void main(String[] args)  {

        String[] commands = { "charcount", "copy", "linecount", "wordcount", "wc" };
    
        String[] helpOption = {"-?" , "-h" , "-help"};
        String[] verboseOption = {"-v" , "-verbose"};
        String[] bannerOption = {"-b" , "-banner"};
        String[][] options = {helpOption,  verboseOption , bannerOption};
        String[] arguments;


        Scanner sc = new Scanner(System.in);
        arguments = sc.nextLine().split(" ");
        for (int i = 0; i < arguments.length; i++) {
            System.out.println(arguments[i]);
        }

        boolean isCommand = Arrays.stream(commands).anyMatch(arguments[0]::equals);

        if(isCommand){
            System.out.println(arguments[0]);
        }
        





        // if (args.length >= 1 && args.length <= 3) {
        //     return;
        // }

        // switch (key) {
        //     case value:

        //         break;

        //     default:
        //         break;
        // }

    }

}