public class Main {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.            
         * Your class should be named Solution. */
        Integer[] numbers = {1,2,3};
        String[] words = {"Hello", "World"};
        
        printArray(numbers);
        printArray(words);
    }
    
    public static void printArray(Object[] array){
        for(Object item : array){
            System.out.println(item);
        }
    }

}
