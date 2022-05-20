import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1049 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	String name1 = sc.nextLine();
    	String name2 = sc.nextLine();
    	String name3 = sc.nextLine();
    	
		if(name1.equalsIgnoreCase("vertebrado")) {
    		if(name2.equalsIgnoreCase("ave")) {
    			
    			if(name3.equalsIgnoreCase("carnivoro")) {
    				System.out.println("aguia");
    			}
    			if(name3.equalsIgnoreCase("onivoro")) {
    				System.out.println("pomba");
    			}
    		}
    		if(name2.equalsIgnoreCase("mamifero")) {
    			
    			if(name3.equalsIgnoreCase("onivoro")) {
    				System.out.println("homem");
    			}
    			if(name3.equalsIgnoreCase("herbivoro")) {
    				System.out.println("vaca");
    			}
    		}
		}
		
		//------------------------------------------------//
		
		if(name1.equalsIgnoreCase("invertebrado")) {
    		if(name2.equalsIgnoreCase("inseto")) {
    			
    			if(name3.equalsIgnoreCase("hematofago")) {
    				System.out.println("pulga");
    			}
    			if(name3.equalsIgnoreCase("herbivoro")) {
    				System.out.println("lagarta");
    			}
    		}
    		if(name2.equalsIgnoreCase("anelideo")) {
    			
    			if(name3.equalsIgnoreCase("hematofago")) {
    				System.out.println("sanguessuga");
    			}
    			if(name3.equalsIgnoreCase("onivoro")) {
    				System.out.println("minhoca");
    			}
    		}
		}
		
    	
    	sc.close();
    }
 
}