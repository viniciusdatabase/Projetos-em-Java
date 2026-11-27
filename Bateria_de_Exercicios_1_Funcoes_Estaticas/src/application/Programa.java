package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// *** VARIÁVEIS ***//
		
		/* não tem variável pois é tudo estático agora haha */

		// *** CÓDIGO ***//

		System.out.println("Diga qual é a cotação do dólar: ");
		CurrencyConverter.cotacaoEmDolar = sc.nextDouble();

		System.out.println("Quantos dolares você quer comprar?");
		CurrencyConverter.valorEmDolares = sc.nextDouble();

		System.out.printf("Isto vai dar: R$ %.2f reais", CurrencyConverter.conversaoReaisXDolares());

		sc.close();

	}

}
