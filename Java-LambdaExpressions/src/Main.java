import java.io.*;
import java.util.*;

interface PerformOperation{
    boolean check(int n);
}

class MyChecker{
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
}

public class Main {
    
    static PerformOperation isOdd(){
        PerformOperation po = (n) -> n%2 != 0 ? false : true; 
        return po;
    }
    
    static PerformOperation isPrime(){
        return n -> {
            if (n <= 1) {
               return false;
            }
           for (int i = 2; i <= Math.sqrt(n); i++) {
               if (n % i == 0) {
                   return false;
                }
            }
           return true;
        };
    }
    
    static PerformOperation isPalindrome(){
        return n -> Integer.toString(n).equals(new StringBuilder().append(n).reverse().toString());
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int lines = Integer.parseInt(sc.nextLine());
    while (lines-- > 0) {
        String s = sc.nextLine();
        String[] numStr = s.split(" ");
        int condition = Integer.parseInt(numStr[0]);
        int numberToCheck = Integer.parseInt(numStr[1]);
        if(condition == 1) {
            MyChecker.checker(isOdd(), numberToCheck);
            System.out.println(MyChecker.checker(isOdd(), numberToCheck)? "EVEN" : "ODD");  
        } else if(condition == 2) {
            System.out.println(MyChecker.checker(isPrime(), numberToCheck)? "PRIME" : "COMPOSITE");
        } else if(condition == 3) {
            System.out.println(MyChecker.checker(isPalindrome(), numberToCheck)? "PALINDROME" : "NOT PALINDROME");
        }
        
    }
    
    sc.close();
    }
}