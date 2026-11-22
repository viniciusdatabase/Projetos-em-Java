import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// *** variaveis ***//

		int N = sc.nextInt() + 1;

		int X, valores_dentro = N, valores_fora = 0;
		//N é a quantidade de elementos a ser lido
		//X é os próprios elementos que o usuário vai colocando

		// ***código***//

		for (int i = 1; i < N; i++) {
			X = sc.nextInt();

			if (X >= 10 && X <= 20) {

				valores_dentro = N - i;
			}

			else {
				valores_fora= i;
			}
			
		} // fim do for

		System.out.printf("%d in\n", valores_dentro);
		System.out.printf("%d out\n", valores_fora);
		
		sc.close();
	} // fim da main

} // fim do programa
