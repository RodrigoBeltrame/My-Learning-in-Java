import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class uri1098 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.0");
    	
    	double i = 0;
    	double j = 1;
    	double k = 0;
    	
    	while(i <= 2.0) {
    		
    		if(j % 3 != 0.0) {		
    			
    			if(df.format(i).endsWith("0")) {		
        			System.out.printf("I=%.0f J=%.0f", i, (j + k));
        			System.out.println();
        			j+=1;
        		} else {
        			System.out.printf("I=%.1f J=%.1f", i, (j + k));
        			System.out.println();
        			j+=1;
        		}
    		}
    		
    		if(j % 3 == 0.0) {
    			
    			if(df.format(i).endsWith("0")) {		
        			System.out.printf("I=%.0f J=%.0f", i, (j + k));
        			System.out.println();
        			i+=0.2;
        			j-=2;
        			k+=0.2;
        		} else {
        			System.out.printf("I=%.1f J=%.1f", i, (j + k));
        			System.out.println();
        			i+=0.2;
        			j-=2;
        			k+=0.2;
        		}
    			
    		}
    	
    	}
    	
    	sc.close();
    }
 
}