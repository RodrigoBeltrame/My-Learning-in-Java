import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class uri1117 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.00");
    	
    	double nota1, nota2, MEDIA;
    	
    	do {
    		nota1 = sc.nextDouble();
    		if(nota1 < 0 || nota1 > 10) {
    			System.out.println("nota invalida");
    		}
    	} while(nota1 < 0 || nota1 > 10);
    	
    	do {
    		nota2 = sc.nextDouble();
    		if(nota2 < 0 || nota2 > 10) {
    			System.out.println("nota invalida");
    		}
    	} while(nota2 < 0 || nota2 > 10);
    	
    	MEDIA = (nota1 + nota2) / 2.0;
    	
    	System.out.println("media = " + df.format(MEDIA));
    	
    	sc.close();
    }
 
}