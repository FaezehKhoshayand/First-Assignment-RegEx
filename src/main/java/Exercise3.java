import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {

    /*
    implement the method below so that it extracts a URL from a String
    I will write the basics for this one method, you will have to implement the other two methods from scratch
    */

    public static String extractURL(String text) {
        String regex = "http(s)?://(www.)?[A-Z0-9-_+&*]*\\.[A-Z0-9]*(\\.[A-Z0-9]*)*";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }
        else{
            return null;
        }
    }

    /*
    implement the method below to validate an email address
     */

    public static boolean validateEmail(String email) {
        String regex = "^[A-Z0-9-_+&*]*@[A-Z0-9-_+&*]*\\.[A-Z0-9-_+&*]*$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    /*
    implement the method below so that it returns a list of words with repeated letters
    */

    public static List<String> findWordsWithRepeatLetters(String input) {
        List<String> wordsWithRepeatLetters = new ArrayList<>();
        String regex = "\\b[a-z]*([a-z])([a-z])*\\1[a-z]*\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            wordsWithRepeatLetters.add(matcher.group());
        }
        return wordsWithRepeatLetters;
    }
    /*
    Bonus Problem ;)
    implement the method below so that it returns a list of words that are repeated twice accidentally in a string
    for example: "appleapple orange pearpear pineapple" -> ["appleapple", "pearpear"]
    */

    public static List<String> findReapetdWords(String input) {
        List<String> repeatedWords = new ArrayList<>();
        return repeatedWords;
        // TODO
    }

    public static void main(String[] args) {
        // test your code here!
    }
}