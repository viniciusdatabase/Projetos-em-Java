import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// *** VARIÁVEIS ***//
		// VARIAVEL CODIGO PRODUTO//
		int c_quente_cod = 1;
		int x_salada_cod = 2;
		int x_bacon_cod = 3;
		int torrada_simp_cod = 4;
		int refri_cod = 5;
		
		//VARIAVEL PREÇO//
		float c_quente_prc = 4.00f;
		float x_salada_prc = 4.50f;
		float x_bacon_prc = 5.00f;
		float torrada_simp_prc = 2.00f;
		float refri_prc = 1.50f;
		float calculo;
		
		//VARIAVEL DE SOMA//
		int p1, p2; // p1 = produto 1 , p2 = quantidade do produto
		
		System.out.println("Faça sua entrada do item: ");
		p1 = sc.nextInt();
		System.out.println("Faça sua entrada com a quantidade dos itens");
		p2 = sc.nextInt();
		
		if (p1 == 1) {
			calculo = c_quente_prc * p2;
			System.out.println("Total: R$ " + calculo);
		}
		
		if (p1 == 2) {
			calculo = x_salada_prc * p2;
			System.out.println("Total: R$ " + calculo);
		}
		
		if (p1 == 3) {
			calculo = x_bacon_prc * p2;
			System.out.println("Total: R$ " + calculo);
		}
		
		if (p1 == 4) {
			calculo = torrada_simp_prc * p2;
			System.out.println("Total: R$ " + calculo);
		}
		
		if (p1 == 5) {
			calculo = refri_prc * p2;
			System.out.println("Total: R$ " + calculo);
		}
		
		else 
			System.out.println("Entrada inválida");		
		
		
	}

}
