import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class uri1116 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.0");
    	
    	int N = sc.nextInt();
    	
    	for(int i = 0; i < N; i++) {
    		
    		int X = sc.nextInt();
    		int Y = sc.nextInt();
    		double DIV = (double) X / Y;
    			
    		if(Y != 0) {
    			System.out.println(df.format(DIV));
    		}
    		if(Y == 0) {
    			System.out.println("divisao impossivel");
    		}
    		
    	}
    	
    	
    	sc.close();
    }
 
}