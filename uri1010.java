import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 

public class uri1010 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int code1 = sc.nextInt();
    	int number1 = sc.nextInt();
    	double price1 = sc.nextDouble();
    	int code2 = sc.nextInt();
    	int number2 = sc.nextInt();
    	double price2 = sc.nextDouble();
    	double amount;
    	
    	amount = number1 * price1 + number2 * price2;
    	
    	System.out.printf("VALOR A PAGAR: R$ %.2f%n", amount);
    	
    	sc.close();
    }
 
}