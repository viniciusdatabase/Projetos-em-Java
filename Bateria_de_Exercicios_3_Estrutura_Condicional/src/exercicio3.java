import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// *** VARIÁVEIS ***//

		int entrada = 0; 	// confere o laço while
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		// ***código**//

		while (entrada != 4) {
			
			entrada = sc.nextInt();

			switch (entrada) {

			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			case 4:
				// não faz nada, apenas evita o default:P
				break;
			default:
				System.out.println("Entrada inválida");
				break;
			} //fim do switch

		}//fim do while

		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}//fim do main

} //fim da classe
