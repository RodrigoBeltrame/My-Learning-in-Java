import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1020 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int x = sc.nextInt();
    	int totalYears, totalMonth, totalDays;
    	
    	totalYears = x / 365;
    	x = x % 365;
    	totalMonth = x / 30;
    	x = x % 30;
    	totalDays = x / 1;
    	
    	System.out.println(totalYears + " ano(s)");
    	System.out.println(totalMonth + " mes(es)");
    	System.out.println(totalDays + " dia(s)");
    	
    	sc.close();
    }
 
}