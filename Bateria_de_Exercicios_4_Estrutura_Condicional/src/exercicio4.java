import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		// *** VARIÁVEIS ***//

		Scanner sc = new Scanner(System.in);
		int inicio_hora, final_hora, calculo;

		// código//

		System.out.println("Diga a hora inicial");
		inicio_hora = sc.nextInt();
		System.out.println("Diga a hora final");
		final_hora = sc.nextInt();

		if (inicio_hora > final_hora) {
			calculo = 24 - inicio_hora + final_hora;
			System.out.println("O jogo durou: " + calculo + " horas");
		} else {

			if (inicio_hora == final_hora) {
				System.out.println("O jogo durou: 24");
			}

			else {
				calculo = (inicio_hora - final_hora) * (-2) / (2);
				System.out.println("O jogo durou: " + calculo + " horas");
			}
		}

		sc.close();

	}

}
