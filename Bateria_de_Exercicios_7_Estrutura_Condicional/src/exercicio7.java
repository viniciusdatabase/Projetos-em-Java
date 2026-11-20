import java.util.Scanner;
import java.util.Locale;

public class exercicio7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float x, y;

		// código//

		System.out.println("Este programa usa . ao invés de ,\n");
		System.out.println("Digite a coordenada de x");
		x = sc.nextFloat();
		System.out.println("Digite a coordenada de y");
		y = sc.nextFloat();

		if (x > 0 && y > 0)
			System.out.println("Q1");
		else if (x < 0 && y < 0)
			System.out.println("Q3");
		else if (x > 0 && y < 0)
			System.out.println("Q4");
		else if (x < 0 && y > 0)
			System.out.println("Q2");
		else
			System.out.println("As duas coordenadas estão na origem");

	}

}
