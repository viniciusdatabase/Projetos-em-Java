import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// *** VARIÁVEIS ***//

		int N; // N é a quantidade de casos a serem inseridos
		float A, B, C;
		// ABC são os valores dos casos a serem inseridos
		double matematica;

		// *** CÓDIGO ***//

		N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			A = sc.nextFloat();
			B = sc.nextFloat();
			C = sc.nextFloat();

			matematica = (((A * 2) + (B * 3) + (C * 5)) / 10);

			System.out.printf("%.1f\n", matematica);

		} // fim do for
		sc.close();
	}// fim do main

}// fim do programa
