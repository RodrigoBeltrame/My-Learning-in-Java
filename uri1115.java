import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1115 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int X, Y;
    	
    	do {
    		
    		 X = sc.nextInt();
    		 Y = sc.nextInt();
    		 
    		 if(X > 0 && Y > 0) {
    			 System.out.println("primeiro");
    		 }
    		 if(X < 0 && Y > 0) { 
    			 System.out.println("segundo");
    		 }
    		 if(X < 0 && Y < 0) {
    			 System.out.println("terceiro");
    		 }
    		 if(X > 0 && Y < 0) {
    			 System.out.println("quarto");
    		 }
    		 
    	 } while(X != 0 && Y != 0);
    	
    	sc.close();
    }
 
}