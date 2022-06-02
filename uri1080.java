import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1080 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int valor = 0; int posicao = 0;
    	int vec[] = new int[100];
    	
    	
    	for(int i = 0; i < 100; i++) {
    		
    		vec[i] = sc.nextInt();
    		
    		if(vec[i] > valor) {
    			
    			valor = vec[i];
    			posicao = i + 1;
    			
    		}
    	}
    	
    	System.out.println(valor);
    	System.out.println(posicao);
    	
    	sc.close();
    }
 
}