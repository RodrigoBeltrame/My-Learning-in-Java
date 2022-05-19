import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1045 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	double a = sc.nextDouble();
    	double b = sc.nextDouble();
    	double c = sc.nextDouble();
    	double A, B = 0, C = 0;
    	
    	A = Math.max(a, Math.max(b, c));
    	
    	//-------------------------------//
    	
    	if(A == a) {
    		B = Math.max( b , c);
    		C = Math.min( b , c);
    	}
    	if(A == b) {
    		B = Math.max( a , c);
    		C = Math.min( a , c);
    	}
    	if(A == c) {
    		B = Math.max( a , b);
    		C = Math.min( a , b);
    	}
    	
    	double A2 = A * A;
    	double B2 = B * B;
    	double C2 = C * C;
    	
    	//-------------------------------//
    	
    	if( A >= (B + C) ) {
    		System.out.println("NAO FORMA TRIANGULO");
    	} else {
    		if( A2 == (B2 + C2)) {
        		System.out.println("TRIANGULO RETANGULO");
        	}
        	if( A2 > (B2 + C2)) {
        		System.out.println("TRIANGULO OBTUSANGULO");
        	}
        	if( A2 < (B2 + C2)) {
        		System.out.println("TRIANGULO ACUTANGULO");
        	}
        	if(A == B && A == C) {
        		System.out.println("TRIANGULO EQUILATERO");
        	}
        	if( (A == B && A != C) || (A == C && A != B) || (B == C && B != A)) {
        		System.out.println("TRIANGULO ISOSCELES");
        	}
    	}
    	
    	sc.close();
    }
 
}