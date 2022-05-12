import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 

public class uri1009 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	String employee = sc.nextLine();
    	double salary = sc.nextDouble();
    	double sales = sc.nextDouble();
    	double finalSalary;
    	
    	finalSalary = salary + sales * 15 / 100;
    	
    	System.out.printf("TOTAL = R$ %.2f%n", finalSalary);
    	
    	sc.close();
    }
 
}