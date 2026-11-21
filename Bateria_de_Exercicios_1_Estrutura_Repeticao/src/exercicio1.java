import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//***variáveis**//
		
		int senha;
		
		//***código**//
		
		System.out.println("Digite a senha do usuário: ");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			
			System.out.println("Senha Inválida");
			senha = sc.nextInt();
			
			
		}
		
		System.out.println("Acesso permitido");
		
	}
	
}
