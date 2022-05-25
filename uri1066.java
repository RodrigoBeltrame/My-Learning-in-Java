import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1066 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int N; int par = 0; int imp = 0; int pos = 0; int neg = 0;
    	
    	
    	for(int i = 0; i < 5; i++) {
    		
    		N = sc.nextInt();
    		
    		if(N % 2 == 0) {
    			par += 1;
    		}
    		if(N % 2 != 0 ){
    			imp += 1;
    		}
    		if(N > 0) {
    			pos += 1;
    		}
    		if(N < 0) {
    			neg += 1;
    		}
    	}
    	
    	System.out.println(par + " valor(es) par(es)");
    	System.out.println(imp + " valor(es) impar(es)");
    	System.out.println(pos + " valor(es) positivo(s)");
    	System.out.println(neg + " valor(es) negativo(s)");
    	
    	
    	sc.close();
    }
 
}