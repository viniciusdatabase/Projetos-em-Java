import java.util.Scanner;
import java.util.Locale;

public class exercicio8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// VARIÁVEIS//
		float renda;
		double calculo;

		// ***CÓDIGO***//
		System.out.println("Este programa usa . ao invés da , \n");
		System.out.println("Digite quanto o cidadão de Lisarb ganha");
		renda = sc.nextFloat();

		if (renda < 2000.00)
			System.out.println("ISENTO");
		else if (renda >= 2000.01 && renda <= 3000.00) {
			calculo = (renda - 1000) * 0.08;
			System.out.printf("R$ %.2f" , calculo);
		} else if (renda >= 3000.01 && renda <= 4500.00) {
			calculo = (1000 * 0.08) + ((renda - 3000 )* 0.18);
			System.out.printf("R$ %.2f" , calculo);
		} else if (renda > 4500.00) {
			calculo = (renda * 0.92);
			System.out.printf("R$ %.2f" , calculo);
		}

	}

}
