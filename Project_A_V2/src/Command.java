interface ICommand {

    void helper();

    void verbose();

    void banner();

}
public class Command {

    String srcFile;

    public ICommand getCommand(String str){

        if (str.equals("charcount")){
            return new CharCount();
        }else if (str.equals("linecount")){
            return new LineCount();
        }else if (str.equals("wordcount")){
            return new WordCount();
        }else if(str.equals("wc")) {
            return new WC();
        }
//        else if (str.equals("copy")){
//            return new Copy();
//        }

        System.out.println("Please enter an allowed command");
        System.exit(0);
        return null;



    }




}
