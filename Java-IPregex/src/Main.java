import java.io.*;
import java.util.*;

class myRegex{
    public final static String regex = "^(([0-1]?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])\\.){3}([0-1]?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5]){1}$";
}

public class Main {

   public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()) {
            String ip = sc.nextLine();
            Check(ip);
        }
        sc.close();
        
    }
    
    private static void Check(String ip) {
        boolean isGood = ip.matches(myRegex.regex);
        if(isGood) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}