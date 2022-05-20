import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class uri1048 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.00");
    	    	
    	double salary =  sc.nextDouble();
    	int porcentage = 0;
    	double newSalary = 0;
    	double readjustment = 0;
    	
    	if(salary >= 0.00 && salary <= 400.00) {
    		porcentage = 15;
    		newSalary = salary + (salary * 0.15);
    		readjustment = newSalary - salary;
    	}
    	if(salary >= 400.01 && salary <= 800.00) {
    		porcentage = 12;
    		newSalary = salary + (salary * 0.12);
    		readjustment = newSalary - salary;
    	}
    	if(salary >= 800.01 && salary <= 1200.00) {
    		porcentage = 10;
    		newSalary = salary + (salary * 0.10);
    		readjustment = newSalary - salary;
    	}
    	if(salary >= 1200.00 && salary <= 2000.00) {
    		porcentage = 7;
    		newSalary = salary + (salary * 0.07);
    		readjustment = newSalary - salary;
    	}
    	if(salary >= 2000.01) {
    		porcentage = 4;
    		newSalary = salary + (salary * 0.04);
    		readjustment = newSalary - salary;
    	}
    	
    	System.out.println("Novo salario : " + df.format(newSalary));
    	System.out.println("Reajuste ganho : " + df.format(readjustment));
    	System.out.println("Em percentual : " + porcentage + " %");
    	
    	sc.close();
    }
 
}