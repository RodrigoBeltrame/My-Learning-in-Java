import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	double A = sc.nextDouble();
    	double B = sc.nextDouble();
    	double C = sc.nextDouble();
    	double perimetro, area;
    	
    	if (Math.abs(B - C) < A && A < B + C &&
    		Math.abs(A - C) < B && B < A + C &&
    		Math.abs(B - A) < C && C < B + A ) {
    		
    		perimetro = A + B + C;
    		
    		System.out.printf("Perimetro = %.1f%n", perimetro);
    	
    	} else {
    		
    		area = ((A + B) * C) / 2;
    		
    		System.out.printf("Area = %.1f%n", area);
    	
    	}
    	

    	
    	sc.close();
    }
 
}