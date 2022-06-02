import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1101 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    
    	int M, N, SOMA = 0;
    	
    	
    	do {
    		
    		M = sc.nextInt();
    		N = sc.nextInt();
    		
	    	if(M > 0 && N > 0) {
    		
    			if(M <= N) {
	    			
	    			for(int i = M; i <= N; i++) {
	    				SOMA += i;
	    				System.out.print(i + " ");
	    			}
	    			
	    		} if(M >= N){
	    			
	    			for(int i = N; i <= M; i++) {
	    				SOMA += i;
	    				System.out.print(i + " ");
	    			}
	    			
	    		}
	    		System.out.println("Sum=" + SOMA);
	    		SOMA = 0;
	    	}
    		
    	} while(M > 0 && N > 0);
    	
    	
    	
    	sc.close();
    }
 
}