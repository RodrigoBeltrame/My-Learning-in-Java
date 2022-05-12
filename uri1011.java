import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 

public class uri1011 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	double R = sc.nextDouble(); //Raio
    	double pi = 3.14159;
    	double volume;
    	
    	volume = (4/3.0) * pi * R * R * R;
    	
    	System.out.printf("VOLUME = %.3f%n", volume);
    	
    	sc.close();
    }
 
}