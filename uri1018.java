import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1018 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int valor = sc.nextInt();
    	int notas100, notas50, notas20, notas10, notas5, notas2, notas1;
    	
    	System.out.println(valor);
    	
    	notas100 = valor / 100;
    	valor = valor % 100;
    	notas50 = valor / 50;
    	valor = valor % 50;
    	notas20 = valor / 20;
    	valor = valor % 20;
    	notas10 = valor / 10;
    	valor = valor % 10;
    	notas5 = valor / 5;
    	valor = valor % 5;
    	notas2 = valor / 2;
    	valor = valor % 2;
    	notas1 = valor / 1;
    	
    	System.out.println(notas100 + " nota(s) de R$ 100,00");
    	System.out.println(notas50 + " nota(s) de R$ 50,00");
    	System.out.println(notas20 + " nota(s) de R$ 20,00");
    	System.out.println(notas10 + " nota(s) de R$ 10,00");
    	System.out.println(notas5 + " nota(s) de R$ 5,00");
    	System.out.println(notas2 + " nota(s) de R$ 2,00");
    	System.out.println(notas1 + " nota(s) de R$ 1,00");
    	
    	sc.close();
    }
 
}   	