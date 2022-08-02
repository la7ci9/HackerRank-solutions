import java.io.*;
import java.util.*;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    public void setTitle(String s) {
	} 
}

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        MyBook myBook = new MyBook();
        Scanner sc = new  Scanner(System.in);
        myBook.title = sc.nextLine();
        
        sc.close();
        System.out.println("The title is: "+myBook.getTitle());
    }
}