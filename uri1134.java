import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1134 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int N = 0; int contAlcool = 0; int contGasolina = 0; int contDiesel = 0;
    	
    	while(N != 4) {
    		
    		N = sc.nextInt();
    		
    		switch(N) {
    		case 1: contAlcool += 1; break;
    		case 2: contGasolina +=1; break;
    		case 3: contDiesel +=1; break;
    		
    		}
    	}
    	
    	System.out.println("MUITO OBRIGADO");
    	System.out.println("Alcool: " + contAlcool);
    	System.out.println("Gasolina: " + contGasolina);
    	System.out.println("Diesel: " + contDiesel);
    	
    	sc.close();
    }
 
}