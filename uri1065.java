import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1065 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int cont = 0;
    	
    	for(int i = 0; i < 0; i++) {
    		
    		int N = sc.nextInt();
    		
    		if(N % 2 == 0) {
    			cont++;
    		}
    	}
    	
    	System.out.println(cont + " valores pares");
    	
    	sc.close();
    }
 
}