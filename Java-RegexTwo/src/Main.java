import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String regex = "(\\b\\w+)(\\s\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE + Pattern.MULTILINE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences != 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            System.out.println(input);
            numSentences--;
        }
        
        in.close();
    }
}