import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class uri1051 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.00");
    	
    	double salario = sc.nextDouble();
    	double imposto = 0;
    	
    	if(salario >= 0.00 && salario<= 2000.00) {
    		System.out.println("Isento");
    	} else if(salario >= 2000.01 && salario <= 3000.00) {
    		salario = salario - 2000.00;
    		imposto = salario * 0.08;
    		System.out.println("R$ "+ df.format(imposto));
    	} else if (salario >= 3000.01 && salario <= 4500.00) {
    		salario = salario - 3000.00;
    		imposto = (salario * 0.18) + (1000 * 0.08);
    		System.out.println("R$ "+ df.format(imposto));
    	} else {
    		salario = salario - 4500.00;
    		imposto = (salario * 0.28) + (1500 * 0.18) + (1000 * 0.08);
    		System.out.println("R$ "+ df.format(imposto));
    	}
    	
    	sc.close();
    }
 
}