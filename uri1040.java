import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class uri1040 {
 
    public static void main(String[] args) throws IOException {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.0");
    	
    	double n1 = sc.nextDouble();
    	double n2 = sc.nextDouble();
    	double n3 = sc.nextDouble();
    	double n4 = sc.nextDouble();
    	double media;
    	
    	media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
    	
    	System.out.println("Media: " + df.format(media));
    	
    	if(media >= 7.0) {
    		System.out.println("Aluno aprovado.");
    	}
    	if(media < 5.0) {
    		System.out.println("Aluno reprovado.");
    	}
    	if(media >= 5.0 && media <= 6.9) {
    		System.out.println("Aluno em exame.");
    		double exame = sc.nextDouble();
    		System.out.println("Nota do exame: " + df.format(exame));
    		media = (media + exame) / 2;   		
    		if(media >= 5.0) {
    			System.out.println("Aluno aprovado.");
    			System.out.println("Media final: " + df.format(media));
    		}else {
    			System.out.println("Aluno reprovado.");
    			System.out.println("Media final: " + df.format(media));
    		}
    		}
    	
    	sc.close();
    }
}  