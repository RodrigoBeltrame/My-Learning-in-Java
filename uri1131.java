import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class uri1131 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int golsInter;
		int golsGremio;
		int repeat;
		int contRepeat = 1;
		int contInter = 0;
		int contGremio = 0;
		int contEmpate = 0;

		do {
			golsInter = sc.nextInt();
			golsGremio = sc.nextInt();

			if (golsInter > golsGremio) {
				contInter += 1;
			}
			if (golsInter < golsGremio) {
				contGremio += 1;
			}
			if (golsInter == golsGremio) {
				contEmpate += 1;
			}

			System.out.println("Novo grenal (1-sim 2-nao)");

			repeat = sc.nextInt();

			if (repeat == 1) {
				contRepeat += 1;
			}

		} while (repeat != 2);
		
		System.out.println(contRepeat + " grenais");
		System.out.println("Inter:" + contInter);
		System.out.println("Gremio:" + contGremio);
		System.out.println("Empates:" + contEmpate);
		
		if (contInter > contGremio) {
			System.out.println("Inter venceu mais");
		}
		if (contInter < contGremio) {
			System.out.println("Gremio venceu mais");
		}
		if (contInter == contGremio) {
			System.out.println("Nao houve vencedor");
		}

		sc.close();
	}

}