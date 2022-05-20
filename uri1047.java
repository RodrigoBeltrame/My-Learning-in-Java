import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1047 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int h1 = sc.nextInt();
    	int m1 = sc.nextInt();
    	int h2 = sc.nextInt();
    	int m2 = sc.nextInt();
    	int ht = 0;
    	int mt = 0;
    	
    	if(m1 == m2) {
    		mt = 0;
    	} else {
    		if(m1 < m2) {
    			mt = m2 - m1;
    		}
    		if(m1 > m2 ) {
    			mt = 60 - m1 + m2;
    		}
    	}
    	
    	if(h1 == h2) {
    		ht = 24;
    	} else {
    		if(h1 < h2) {
    			ht = h2 - h1;
    		}
    		if(h1 > h2) {
    			ht = 24 - h1 + h2;
    		}
    	}
    	
    	if(h1 == h2 && m1 < m2) {
    		ht = 0;
    	}
    	
    	if(ht >= 1 && m1 > m2) {
    		ht = ht - 1;
    	}
    	
    	System.out.println("O JOGO DUROU " + ht + " HORA(S) E " + mt + " MINUTO(S)");
    	
    	sc.close();
    }
 
}