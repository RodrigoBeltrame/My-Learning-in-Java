import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 

public class uri1008 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int employeeNun = sc.nextInt();
    	int workedHours = sc.nextInt();
    	double valuePerHour = sc.nextDouble();
    	double salary;
    	
    	salary = workedHours * valuePerHour;
    	
    	System.out.println("NUMBER = " + employeeNun);
    	System.out.printf("SALARY = U$ %.2f%n", salary);
    	
    	sc.close();
    }
 
}