import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1046 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int h = 24;
    	int duracao;
    	
    	if(a >= b) {
    		duracao = h - a + b;
    		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    	} else {
    		duracao = b - a;
    		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    	}
    	
    	sc.close();
    }
 
}