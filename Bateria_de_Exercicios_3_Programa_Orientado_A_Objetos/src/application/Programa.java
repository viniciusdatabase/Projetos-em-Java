package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// *** variáveis ***//

		Student estudante = new Student();

		// *** CÓDIGO ***//

		System.out.print("Type student's name: ");
		estudante.name = sc.nextLine();

		System.out.println("Type first grade");
		estudante.g1 = sc.nextFloat();

		do {

			if (estudante.g1 > 30 || estudante.g1 < 0) {
				System.out.println("Invalid input, please enter a valid one");
				estudante.g1 = sc.nextFloat();

			}

		} while (estudante.g1 > 30);

		System.out.println("Type second grade");
		estudante.g2 = sc.nextFloat();

		do {

			if (estudante.g2 > 35 || estudante.g2 < 0) {
				System.out.println("Invalid input, please enter a valid one");
				estudante.g2 = sc.nextFloat();

			}

		} while (estudante.g2 > 35 );

		System.out.println("Type third grade");
		estudante.g3 = sc.nextFloat();

		do {

			if (estudante.g3 > 35 || estudante.g3 < 0) {
				System.out.println("Invalid input, please enter a valid one");
				estudante.g3 = sc.nextFloat();

			}

		} while (estudante.g3 > 35);

		estudante.somatory();

		sc.close();
	}

}
