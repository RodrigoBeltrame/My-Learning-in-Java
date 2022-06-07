import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1132 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);

    	int A, B;
    	int SOMA = 0;
    	int X = sc.nextInt();
    	int Y = sc.nextInt();
    	
    	if(X < Y) {
    		A = X;
    		B = Y;
    	} else {
    		A = Y;
    		B = X;
    	}
    	
    	for (int i = A; i <= B; i++) {
    		if(i % 13 != 0) {
    			SOMA = SOMA + i;
    		}
    	}
    	
    	System.out.println(SOMA);
    	
    	
    	
    	sc.close();
    }
 
}