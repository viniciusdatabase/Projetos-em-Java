import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String [] args) {
		
		//Deixar a entrada do programa em US//
		
		Locale.setDefault(Locale.US);
		
		//*** VARIÁVEIS ***//
		
		float A, B, C; 
		double area_triangulo, area_circulo, area_trapezio, area_quadrado, area_retangulo;
		Scanner sc = new Scanner(System.in);
		
		//*** código ***//
		System.out.println("Este programa usa o padrão US de pontuação, usar . ao invés de ,");
		System.out.println("Digite o valor de A");
		A = sc.nextFloat();
		System.out.println("Digite o valor de B");
		B = sc.nextFloat();
		System.out.println("Digite o valor de C");
		C = sc.nextFloat();
		
		//*** VALOR ABSOLUTO***//
		
		A = Math.abs(A);
		B = Math.abs(B);
		C = Math.abs(C);
		
		//*** EQUAÇÕES ***//
		
		area_triangulo = (A*C)/2;
		area_circulo = 3.14159 * Math.pow(C,2);
		area_trapezio = ((A + B ) * C )/2;
		area_quadrado = Math.pow(B, 2);
		area_retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f", area_triangulo);
		System.out.printf("\nCIRCULO: %.3f", area_circulo);
		System.out.printf("\nTRAPEZIO: %.3f", area_trapezio);
		System.out.printf("\nQUADRADO: %.3f", area_quadrado);
		System.out.printf("\nRETANGULO: %.3f", area_retangulo);
		
		sc.close();
		
	}
	
}
