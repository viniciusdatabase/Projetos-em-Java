import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//*** variaveis ***//
		
		int entrada = sc.nextInt();
		int calculo;

		//*** CÓDIGO ***//
		
		
		for(int i = 0 ; i <= entrada; i++ ) {
			
			calculo = i % 2;
			
			if(calculo != 0) {
				
				System.out.println(i);
				
			}//fim do if
			
			
		}//fim do for
		
		sc.close();
		
	}
	
}