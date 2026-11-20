import java.util.Scanner;

public class main {
	
	public static void main (String [] args) {
		
		//*** ENTRADA DE DADOS ***//
		
		Scanner sc = new Scanner(System.in);
		
		//*** VARIÁVEIS ***//
		
		int A, B, C, D, DIFERENCA;
		
		//*** CÓDIGO ***//
		
		System.out.println("Escreva 4 numeros e eu direi a diferenca entre eles");
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		//*** FÓRMULA DIFERENCA ***//
		
		DIFERENCA = (A * B - C * D);
		
		System.out.printf("Diferença = %d" , DIFERENCA);
		
		sc.close();
	}
	
		

}
