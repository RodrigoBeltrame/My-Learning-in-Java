import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1021 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	double x = sc.nextDouble();
    	int notas100,  notas50,  notas20, notas10, notas5,  notas2;
    	int moedas100,  moedas50, moedas25, moedas10, moedas5,  moedas1;
    	
    	notas100 = (int) x / 100;
    	x = x % 100;
    	notas50 = (int) x / 50;
    	x = x % 50;
    	notas20 = (int) x / 20;
    	x = x % 20;
    	notas10 = (int) x / 10;
    	x = x % 10;
    	notas5 = (int) x / 5;
    	x = x % 5;
    	notas2 = (int) x / 2;
    	x = x % 2;
    	x = x * 100;
    	moedas100 = (int) x / 100;
    	x = x % 100;
    	moedas50 = (int) x / 50;
    	x = x % 50;
    	moedas25 = (int) x / 25;
    	x = x % 25;
    	moedas10 = (int) x / 10;
    	x = x % 10;
    	moedas5 = (int) x / 5;
    	x = x % 5;
    	moedas1 = (int) x / 1;
    	
    	System.out.println("NOTAS:");
    	System.out.println(notas100 + " nota(s) de R$ 100.00");
    	System.out.println(notas50 + " nota(s) de R$ 50.00");
    	System.out.println(notas20 + " nota(s) de R$ 20.00");
    	System.out.println(notas10 + " nota(s) de R$ 10.00");
    	System.out.println(notas5 + " nota(s) de R$ 5.00");
    	System.out.println(notas2 + " nota(s) de R$ 2.00");
    	System.out.println("MOEDAS:");
    	System.out.println(moedas100 + " moeda(s) de R$ 1.00");
    	System.out.println(moedas50 + " moeda(s) de R$ 0.50");
    	System.out.println(moedas25 + " moeda(s) de R$ 0.25");
    	System.out.println(moedas10 + " moeda(s) de R$ 0.10");
    	System.out.println(moedas5 + " moeda(s) de R$ 0.05");
    	System.out.println(moedas1 + " moeda(s) de R$ 0.01");
    	
    	sc.close();
    }
 
}