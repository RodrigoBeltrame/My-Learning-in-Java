import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1042 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int max1, max2 = 0, max3 = 0;
    	
    	max1 = Math.max(a, Math.max(b, c));
    	
    	if(max1 == a) {
    		max2 = Math.max( b , c);
    		max3 = Math.min( b , c);
    	}
    	if(max1 == b) {
    		max2 = Math.max( a , c);
    		max3 = Math.min( a , c);
    	}
    	if(max1 == c) {
    		max2 = Math.max( a , b);
    		max3 = Math.min( a , b);
    	}
    	
    	System.out.print(max3 + "\n" + max2 + "\n" + max1 + "\n\n");
		System.out.print(a + "\n" + b + "\n" + c + "\n");
    	
    	sc.close();
    }
 
}