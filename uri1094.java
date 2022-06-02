import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class uri1094 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.00");
    	
    	int total = 0; int coelhos = 0; int ratos = 0; int sapos = 0; int N = 0;
    	double coelhosP = 0; double ratosP = 0; double saposP = 0;
    	
    	N = sc.nextInt();
    	
    	for(int i = 0; i < N; i++) {
    		
    		int cobaias = sc.nextInt();
    		String especie = sc.next();
    	
    		if(especie.equalsIgnoreCase("C")) {
    			
    			coelhos = coelhos + cobaias;
    			
    		}
    		if(especie.equalsIgnoreCase("R")) {
    			
    			ratos = ratos + cobaias;
    			
    		}
    		if(especie.equalsIgnoreCase("S")) {
    			
    			sapos = sapos + cobaias;
    			
    		}
    	
    	total = total + cobaias;
    	
    	coelhosP = ((double)(coelhos) / total) * 100;
    	ratosP = ((double)(ratos) / total) * 100;
    	saposP = ((double)(sapos) / total) * 100;
    		
    	}
    	
    	System.out.println("Total: " + total + " cobaias");
    	System.out.println("Total de coelhos: " + coelhos);
    	System.out.println("Total de ratos: " + ratos);
    	System.out.println("Total de sapos: " + sapos);
    	System.out.println("Percentual de coelhos: " + df.format(coelhosP) + " %");
    	System.out.println("Percentual de ratos:  " + df.format(ratosP) + " %");
    	System.out.println("Percentual de sapos: " + df.format(saposP) + " %");
    	
    	sc.close();
    }
 
}