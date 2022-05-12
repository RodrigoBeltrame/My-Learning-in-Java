import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 

public class uri1007 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int d = sc.nextInt();
    	int dif;
    	
    	dif = a * b - c * d;
    	
    	System.out.println("DIFERENCA = " + dif);
    	
    	sc.close();
    }
 
}