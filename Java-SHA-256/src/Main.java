import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(line.getBytes());
        
        for(byte b : hash) {
            System.out.print(String.format("%02x", b));
        }
        
        System.out.println();
        sc.close();
    }

}
