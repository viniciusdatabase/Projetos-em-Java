import java.util.Scanner;

public class exercicio6 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//variaveis//
		float intervalo;
		
		System.out.println("Digite um intervalo");
		intervalo = sc.nextInt();
		
		if (intervalo >= 0 && intervalo <=25) {
			System.out.println("Intervalo [0, 25]");
		}
		
		if (intervalo >= 26 && intervalo <=50) {
			System.out.println("Intervalo [26, 50]");
		}
		
		if (intervalo >= 51 && intervalo <=75) {
			System.out.println("Intervalo [51, 75]");
		}
		
		if (intervalo >= 76 && intervalo <=100) {
			System.out.println("Intervalo [76, 100]");
		}
		
		if (intervalo >100 || intervalo <0) 
			System.out.println("Fora de intervalo");
		
	}
	
}
