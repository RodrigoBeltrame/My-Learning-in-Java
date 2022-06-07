import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1143 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int cont = 1;
    	int N = sc.nextInt();
    	
    	while(cont <= N) {
    		
    		int A = cont;
    		int B = cont * cont;
    		int C = cont * cont * cont;
    		
    		System.out.println(A + " " + B + " " + C);
    		
    		cont+= 1;
    	}
    	
    	sc.close();
    }
 
}