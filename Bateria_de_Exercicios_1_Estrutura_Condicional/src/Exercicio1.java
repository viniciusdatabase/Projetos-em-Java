import java.util.Scanner;

public class Exercicio1 {

		public static void main(String [] args) {
		
			//variáveis//
			int val1;
			Scanner sc = new Scanner (System.in);
			
			//código//
			
			System.out.println("Digite um numero inteiro e eu direi se é negativo ou não");
			val1 = sc.nextInt();
			
			if(val1>=0)
				System.out.println("NÃO NEGATIVO");
			
			else
				System.out.println("NEGATIVO");
			
			sc.close();
		}
		
	}

