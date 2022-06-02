import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1095 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int i = 1;
    	
    	for(int j = 60; j >= 0; j -= 5) {
    		System.out.println("I=" + i + " J=" + j);
    		i += 3;
    	}
    	
    	sc.close();
    }
 
}