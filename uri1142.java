import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1142 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int cont = 1;
    	int N = sc.nextInt();
    	int contTotal = 4 * N;
    	
    	while(cont <= contTotal) {
    		
    		if(cont % 4 == 0) {
    			System.out.println("PUM");
    		} else {
    			System.out.print(cont + " ");
    		}
    		
    		cont += 1;
    	}
    	
    	sc.close();
    }
 
}