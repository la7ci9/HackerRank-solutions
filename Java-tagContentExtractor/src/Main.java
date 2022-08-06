import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        
        while(num-- > 0){
            boolean match = false;
            String line = sc.nextLine();
            
            Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matcher = p.matcher(line);
            while(matcher.find())
            {
                System.out.println(matcher.group(2));
                match = true;
            }
            if(! match){
                System.out.println("None");
            }
        }
        sc.close();
    }
}
