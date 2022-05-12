import java.io.IOException;
import java.util.Scanner;

public class uri1002 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        double raio = sc.nextDouble();
        double area = 3.14159 * raio * raio;
        
        System.out.printf("A= %.4f%n", area);
        
        sc.close();
        
    }
}