import java.util.Scanner;

public class main {
	
	
	public static void main (String[] args) {
		
		//*** VARIÁVEIS ***//
		
		Scanner sc = new Scanner(System.in);
		int a, b, soma;
		
		//*** CÓDIGO ***//
		
		System.out.println("Digite o primeiro numero: ");
		a = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		b = sc.nextInt();
		soma = a+b;
		System.out.println("Soma = " + soma);
		
		sc.close(); //fecha o Scanner
		
	}

}
