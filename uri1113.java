import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1113 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int X, Y;
    	
    	do {
    		X = sc.nextInt();
    		Y = sc.nextInt();
    		
    		if(X < Y) {
    			System.out.println("Crescente");
    		}
    		if(X > Y) {
    			System.out.println("Decrescente");
    		}
    	} while(X != Y);
    	
    	sc.close();
    }
 
}