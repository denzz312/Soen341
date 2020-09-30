import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        String[] arguments;
        Scanner sc = new Scanner(System.in);
        arguments = sc.nextLine().split(" ");
        sc.close();
        Administrator adm = new Administrator();
        adm.administer(arguments);






    }
}
