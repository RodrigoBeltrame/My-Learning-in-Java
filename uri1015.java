import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 

public class uri1015 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	double x1 = sc.nextDouble();
    	double y1 = sc.nextDouble();
    	double x2 = sc.nextDouble();
    	double y2 = sc.nextDouble();
    	double distance;
    	
    	distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
    	
    	System.out.printf("%.4f%n", distance);
    	
    	sc.close();
    }
 
}