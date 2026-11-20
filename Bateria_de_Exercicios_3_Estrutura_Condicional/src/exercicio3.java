import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		//*** variáveis ***//
		
		int val1, val2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		val1 = sc.nextInt();
		System.out.println("Digite outro numero inteiro");
		val2 = sc.nextInt();
		
				
		if(val1 % val2 == 0 || val2 % val1 == 0)
			System.out.println("São Multiplos");
		
		else
			System.out.println("Não são Multiplos");
		
		sc.close();
	}

}
