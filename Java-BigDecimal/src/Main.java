import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	String num = sc.nextLine();
        	list.add(num);
        }
        
        sc.close();
        Collections.sort(list,new Comparator<String>(){
        	@Override
        	public int compare(String a, String b) {
        		BigDecimal a1 = new BigDecimal(a);
        		BigDecimal b1 = new BigDecimal(b);
        		return a1.compareTo(b1);
        	}
        }.reversed());
        
        for (String bigDecimal : list) {
			System.out.println(bigDecimal);
		}
    }
}