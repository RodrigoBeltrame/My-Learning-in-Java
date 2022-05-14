import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1019 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int time = sc.nextInt();
    	int hh, mm, ss;
    	
    	hh = time / 3600;
    	time = time % 3600;
    	mm = time / 60;
    	time = time % 60;
    	ss = time / 1;
    	
    	System.out.println(hh + ":" + mm + ":" + ss);
    	
    	sc.close();
    }
 
}