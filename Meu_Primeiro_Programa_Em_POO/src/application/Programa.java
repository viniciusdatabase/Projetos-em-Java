package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Motor;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		// *** VARIÁVEIS ***//
		
		Motor carro = new Motor();
		
		int opcao;

		// *** CÓDIGO ***//

		// *** LIGAR CARRO**//
		System.out.println("O carro se encontra " + carro.ligado + " deseja liga-lo?");
		opcao = (char) sc.nextLong();

		if (opcao == 1) {

			carro.ligar_O_Carro();
		}
		else {
			System.out.println("O carro continua desligado e você saiu dele");
			System.exit(0); // o programa acaba
		}

		// *** ACELERAR O CARRO ***//

		System.out.println(
				"Você agora está na rodovia parado no acostamento, qual velocidade você quer colocar na caranga?");

		carro.velocidade = sc.nextDouble();

		carro.aceleracao();

		sc.close();

	} //fim do main

}
