import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1075 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int N;
    	
    	N = sc.nextInt();
    	
    	for(int i = 1; i <= 10000; i++) {
    		
    		if(i % N == 2) {
    			System.out.println(i);
    		}
    	}
    	
    	sc.close();
    }
 
}