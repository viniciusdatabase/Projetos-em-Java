import java.util.Scanner;
import java.util.Locale;

public class exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float x = 1, y = 1;

		// código //

		System.out.println("Este programa usa . ao invés de ,\n");

		while (x != 0 && y != 0) {

			System.out.println("Digite a coordenada de x");
			x = sc.nextFloat();
			System.out.println("Digite a coordenada de y");
			y = sc.nextFloat();

			if (x > 0 && y > 0)
				System.out.println("Primeiro");
			else if (x < 0 && y < 0)
				System.out.println("Terceiro");
			else if (x > 0 && y < 0)
				System.out.println("Quarto");
			else if (x < 0 && y > 0)
				System.out.println("Segundo");
		}

	}

}