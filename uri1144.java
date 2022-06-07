import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1144 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int cont = 1;
    	int N = sc.nextInt();
    	
    	while(cont <= N) {
    		
    		int A = cont;
    		int B = cont * cont;
    		int B1 = B + 1;
    		int C = cont * cont * cont;
    		int C1 = C + 1;
    		
    		System.out.println(A + " " + B + " " + C);
    		System.out.println(A + " " + B1 + " " + C1);
    		
    		cont+= 1;
    	}
    	
    	sc.close();
    }
 
}