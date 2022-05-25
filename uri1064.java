import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1064 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int cont = 0;
    	int contPositive = 0;
    	double total = 0;
    	double media = 0;
    	
    	while(cont < 6) {
    		cont++;
    		double N = sc.nextDouble();
    		
    		if(N > 0) {
    			contPositive++;
    			total += N;
    		}
    	}
    	
    	media = total/contPositive;
    	
    	System.out.println(contPositive + " valores positivos");
    	System.out.printf("%.1f%n", media);
    	
    	sc.close();
    }
 
}