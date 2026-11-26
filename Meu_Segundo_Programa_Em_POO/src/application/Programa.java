package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Matematica;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		// *** VARIÁVEIS ***//

		Matematica calc = new Matematica();
		int opcao;

		// *** CÓDIGO ***//

		System.out.println("Escolha qual operação deseja fazer");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");

		opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			calc.a = sc.nextDouble();
			calc.b = sc.nextDouble();
			calc.soma();
			break;

		case 2:
			calc.a = sc.nextDouble();
			calc.b = sc.nextDouble();
			calc.subtracao();
			break;

		case 3:
			calc.a = sc.nextDouble();
			calc.b = sc.nextDouble();
			calc.multiplicacao();
			break;

		case 4:
			calc.a = sc.nextDouble();
			calc.b = sc.nextDouble();
			calc.divisao();
			break;

			default:
				System.out.println("espertinho, só por isso vou encerrar o teu programa");
				System.exit(0); // o programa acaba
				break;
		}

		sc.close();

	}

}
