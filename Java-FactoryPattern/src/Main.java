import java.io.*;
import java.util.*;

interface Food {
    public String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
	public static Food getFood(String order){
        if(order.equals("pizza")){
        	System.out.println("The factory returned class Pizza");
            return new Pizza();
        }
        
        if(order.equals("cake")){
        	System.out.println("The factory returned class Cake");
            return new Cake();
        }
		return null;
    }
}

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        Food f = FoodFactory.getFood(line);
        System.out.println(f.getType());
        
        sc.close();
    }
}
