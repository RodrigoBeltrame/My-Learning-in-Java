import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1133 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);

    	int A, B;
    	int X = sc.nextInt();
    	int Y = sc.nextInt();
    	
    	if(X < Y) {
    		A = X;
    		B = Y;
    	} else {
    		A = Y;
    		B = X;
    	}
    	
    	for (int i = A + 1; i < B; i++) {
    		if(i % 5 == 2) {
    			System.out.println(i);
    		}
    		if(i % 5 == 3) {
    			System.out.println(i);
    		}
    	}
  
    	sc.close();
    }
 
}