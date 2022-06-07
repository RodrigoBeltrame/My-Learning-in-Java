import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class uri1118 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.00");
    	
    	
    	int repetir = 0;
    	double nota1, nota2, MEDIA;
    	
    	while(repetir != 2) {
    		
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
    		
    		MEDIA = (nota1 + nota2) / 2;
    		
    		System.out.println("media = " + df.format(MEDIA));
    		System.out.println("novo calculo (1-sim 2-nao)");
    		
    		do {
    			repetir = sc.nextInt();
    			if(repetir < 1 || repetir > 2) {
    				System.out.println("novo calculo (1-sim 2-nao)");
    			}
    		} while(repetir < 1 || repetir > 2);
    			
    	}
    	
    	sc.close();
    }
 
}