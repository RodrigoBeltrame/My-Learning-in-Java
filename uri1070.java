import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1070 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	int cont = 0;
    	
    	while(cont < 6) {
    		if(N % 2 != 0) {
    			cont++;
    			System.out.println(N);
    		}
    		N++;
    	}
    	
    	sc.close();
    }
 
}
