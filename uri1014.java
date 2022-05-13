import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 

public class uri1014 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int distance = sc.nextInt();
    	double liters = sc.nextDouble();
    	double consume = distance/liters;
    	
    	System.out.printf("%.3f km/l%n", consume);
    	
    	sc.close();
    }
 
}