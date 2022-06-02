import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1097 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int i = 1;
    	int j = 7;
    	int k = 0;
    	
    	while(i <= 9) {
    		
    		if(j % 5 != 0) {		
    			System.out.println("I=" + i + " J=" + (j + k));
    			j-=1;
    		}
    		if(j % 5 == 0) {
    			System.out.println("I=" + i + " J=" + (j + k));
    			i+=2;
    			j+=2;
    			k+=2;
    		}
    	}
    	
    
    	sc.close();
    }
 
}