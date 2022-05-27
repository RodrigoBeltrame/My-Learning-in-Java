import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1071 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int X = sc.nextInt();
    	int Y = sc.nextInt();
    	int SOMA = 0;
    	
    		
    	if(X < Y) {
    		for(int i = X + 1; i < Y; i++) {
    			if(i % 2 != 0) {
    				SOMA = SOMA + i;
    			}
    		}
    	}
    		
    	if(Y < X) {
    		for(int i = Y + 1; i < X; i++) {
    			if(i % 2 != 0) {
    				SOMA = SOMA + i;
    			}
    		}
    			
    	}
    	
    	System.out.println(SOMA);
    	
    	sc.close();
    }
 
}