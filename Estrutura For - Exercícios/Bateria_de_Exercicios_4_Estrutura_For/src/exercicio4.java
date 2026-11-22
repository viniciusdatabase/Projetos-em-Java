import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		//*** VARIÁVEIS ***//
		
		int N; //N é a entrada do usuário com quantos numeros ele vai querer
		float A, B; //A e B é a entrada do usuário com os numeros
		double matematica;
		
		//*** CÓDIGO ***//
		
		N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			A = sc.nextFloat();
			B = sc.nextFloat();
			
			matematica = A / B;
			
			if (B == 0)
				System.out.println("divisão impossível");
			
			else
				System.out.println(matematica);
			
		} // fim do for
		
		sc.close();
		
	} //fim do main
	
} //fim do programa
