import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, matematica;

		N = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			matematica = N % i;

			if (matematica == 0) {

				System.out.println(i);
			}

		} // fim do for

		sc.close();

	}// fim do main

}
