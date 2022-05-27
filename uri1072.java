import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1072 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int N; int cont = 0; int X; int in = 0; int out = 0;
    	
    	N = sc.nextInt();
    	
    	while (cont < N) {
    		X = sc.nextInt();
    		if(X >= 10 && X <= 20) {
    			in++;
    		} else {
    			out++;
    		}
    		cont++;
    	}
    	
    	System.out.println(in + " in");
    	System.out.println(out + " out");
    	
    	sc.close();
    }
 
}