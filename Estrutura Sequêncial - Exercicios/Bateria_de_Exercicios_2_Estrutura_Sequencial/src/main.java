import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void ex2 (String [] args) {
		
		//definindo o padrão americano para colocar .
		
		Locale.setDefault(Locale.US);

		
		//*** VARIÁVEIS ***//
		
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159, area, raio;
		
		//*** INÍCIO DO CÓDIGO ***//
		System.out.println("Este programa utiliza . ao invés da vírgula\n");
		System.out.println("Qual é o valor do raio?");
		raio = sc.nextDouble();
		
		//*** FUNÇÃO MATEMÁTICA***//
		
		area = pi * Math.pow(raio, 2);
		
		//*** CONTINUAÇÃO DO CÓDIGO***//
				
		System.out.printf("O resultado do raio é de: %.4f " , area);
		
		sc.close();
	}

}
