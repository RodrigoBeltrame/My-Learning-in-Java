import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class uri1079 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.0");
    	
    	int N; double A; double B; double C; double MEDIA; 
    	
    	N = sc.nextInt();
    	
    	for(int i = 1; i <= N; i++) {
    		
    		A = sc.nextDouble();
    		B = sc.nextDouble();
    		C = sc.nextDouble();
    		
    		MEDIA =  ((A * 2) + (B * 3) + (C * 5))/10;
    		
    		System.out.println(df.format(MEDIA));
    	}
    	
    	sc.close();
    }
 
}