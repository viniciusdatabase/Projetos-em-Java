import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main (String [] args ){
		
		//Locale para deixar padrão US//
		
		Locale.setDefault(Locale.US);
		
		//*** VARIÁVEIS ***//
		
		Scanner sc = new Scanner(System.in);
		
		float valor_un1, valor_un2;  //valor unitário da peça 1 e valor unitário da peça 2
		int cod_1, num_pcs1;  //código produto 1, numero de peças do produto 1
		int cod_2, num_pcs2; //código produto 2, numero de peças do produto 2
		float calculo;// calcula a soma de tudo
		
		//*** CÓDIGO ***//
		
		System.out.println("Este programa aceita . ao invés de ,");
		System.out.println("Digite o código da primeira peça: ");
		cod_1 = sc.nextInt();
		System.out.println("Digite o numero de peças adquiridas: ");
		num_pcs1 = sc.nextInt();
		System.out.println("Digite o valor de cada peça unitariamente: ");
		valor_un1 = sc.nextFloat();
		
		System.out.println("Digite o código da segunda peça: ");
		cod_2 = sc.nextInt();
		System.out.println("Digite o numero de peças adquiridas: ");
		num_pcs2 = sc.nextInt();
		System.out.println("Digite o valor de cada peça unitariamente: ");
		valor_un2 = sc.nextFloat();
	
		
		calculo = ((num_pcs1*valor_un1) + (num_pcs2*valor_un2));
		
		
		
		System.out.printf("\nO valor total a pagar é de %.2f", calculo );
		
		sc.close();

		
	}
	
	
}
