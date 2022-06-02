import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1099 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	
    	for(int i = 0; i < N; i++) {
    		
    		int X = sc.nextInt();
    		int Y = sc.nextInt();
    		int SOMA = 0;
    		
    		if(X < Y) {
    			
    			for(int j = X + 1; j < Y; j++) {
    				
    				if(j % 2 != 0) {
    					SOMA += j;
    				}
    			}
    		}
    		
    		if(X > Y) {
    			
    			for(int j = Y + 1; j < X; j++) {
    				
    				if(j % 2 != 0) {
    					SOMA += j;
    				}
    			}
    		}
    		
    		System.out.println(SOMA);
    				
    	}
    	
    	sc.close();
    }
 
}