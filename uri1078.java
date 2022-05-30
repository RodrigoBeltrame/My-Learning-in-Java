import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1078 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int N; int X;
    	
    	N = sc.nextInt();
    	
    	for(int i = 1; i <=10 ; i++) {
    		
    		X = i * N;
    		
    		System.out.println(i + " x " + N + " = " + X);
    	}
    	
    	sc.close();
    }
 
}