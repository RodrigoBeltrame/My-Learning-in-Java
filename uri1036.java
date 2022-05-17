import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1036 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	double a = sc.nextDouble();
    	double b = sc.nextDouble();
    	double c = sc.nextDouble();
    	double bhaskaraP, bhaskaraN, delta;
    	
    	delta = Math.sqrt(b * b - 4 * a * c);
    	bhaskaraP = (-b + delta) / (2 * a);
    	bhaskaraN = (-b - delta) / (2 * a);
    	
    	if(a != 0 && delta >= 0) {
    		System.out.printf("R1 = %.5f%n", bhaskaraP);
    		System.out.printf("R2 = %.5f%n", bhaskaraN);
    	} else {
    		System.out.println("Impossivel calcular");
    	}
    	
    	sc.close();
    }
 
}