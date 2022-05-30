import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1074 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int N; int X;
    	
    	N = sc.nextInt();
    	
    	for(int i = 0; i < N; i++) {
    		
    		X = sc.nextInt();
    		
    		if(X > 0 && X % 2 == 0) {
    			System.out.println("EVEN POSITIVE");
    		} else if(X < 0 && X % 2 == 0) {
    			System.out.println("EVEN NEGATIVE");
    		} else if(X > 0 && X % 2 != 0) {
    			System.out.println("ODD POSITIVE");
    		} else if(X < 0 && X % 2 != 0) {
    			System.out.println("ODD NEGATIVE");
    		} else {
    			System.out.println("NULL");
    		}
    	} 
    	
    	sc.close();
    }
 
}