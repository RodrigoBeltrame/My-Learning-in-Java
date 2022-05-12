import java.io.IOException;
import java.util.Scanner; 

public class uri1004 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = a * b;
        
        System.out.println("PROD = "+ prod);
        
        sc.close();
        
    }
 
}