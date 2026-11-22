import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// VARIÁVEIS//

		int N;
		double quadrado, cubo;

		// ***código***//

		N = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			quadrado = Math.pow(i, 2);
			cubo = Math.pow(i, 3);

			System.out.printf("\n%d %.0f %.0f", i, quadrado, cubo);
		} //fim do for]
		
		sc.close();
		
	} //fim da main

}
