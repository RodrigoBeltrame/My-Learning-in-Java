import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1114 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int TruePassword = 2002;
    	int Password;
    	
    	do {
    		Password = sc.nextInt();
    		
    		if(Password == TruePassword) {
    			System.out.println("Acesso Permitido");
    		} else {
    			System.out.println("Senha Invalida");
    		}
    		
    	} while(Password != TruePassword);
    	
    	sc.close();
    }
 
}