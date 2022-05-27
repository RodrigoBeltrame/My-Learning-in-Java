import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1073 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int N; int X; 
    	
    	N = sc.nextInt();
    	
    	for(int i = 2; i <= N; i++) {
    		if(i % 2 == 0) {
    			X = i * i;
    			System.out.println(i + "^2 = " + X);
    		}
    	}
    	
    	
    	sc.close();
    }
 
}