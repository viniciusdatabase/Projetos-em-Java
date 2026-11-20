import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] gets) {
		//*** VARIÁVEIS ***//
		Scanner sc = new Scanner(System.in);
		int val1, calculo;
		
		System.out.println("Digite um numero inteiro e direi se ele é par ou ímpar");
		val1 = sc.nextInt();
		
		calculo = val1 % 2;
		
		if (calculo == 0)
			System.out.println("O numero é par");
		else
			System.out.println("O numero é ímpar");
		
		sc.close();
		
	}

}
