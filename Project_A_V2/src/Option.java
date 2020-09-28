
public class Option {

    public ICounter getOption(String str){

        if (str.equals("charcount")){
            return new CharCount();
        }else if (str.equals("copy")){
            return new Copy();
        }else if (str.equals("linecount")){
            return new LineCount();
        }else if (str.equals("wordcount")){
            return new WordCount();
        }else {
            return new WC();
        }




    }


}
