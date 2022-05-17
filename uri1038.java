import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1038 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int cod = sc.nextInt();
    	int qntd = sc.nextInt();
    	double total;
    	
    	if(cod == 1) {
    		total = qntd * 4.00;
    		System.out.printf("Total: R$ %.2f%n", total);
    	} 
    	if(cod == 2) {
    		total = qntd * 4.50;
    		System.out.printf("Total: R$ %.2f%n", total);
    	}
    	if(cod == 3) {
    		total = qntd * 5.00;
    		System.out.printf("Total: R$ %.2f%n", total);
    	}
    	if(cod == 4) {
    		total = qntd * 2.00;
    		System.out.printf("Total: R$ %.2f%n", total);
    	}
    	if(cod == 5) {
    		total = qntd * 1.50;
    		System.out.printf("Total: R$ %.2f%n", total);
    	}
    	
    	sc.close();
    }
 
}