import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 

public class uri1017 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int cons = 12; //Km/l
    	int time = sc.nextInt(); //hours
    	int speed = sc.nextInt(); //Km/h
    	double distance = speed * time;
    	double liters = distance / cons;
    	
    	System.out.printf("%.3f%n", liters);
    	
    	sc.close();
    }
 
}