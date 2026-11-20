import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main (String [] args) {
		
		//Locale para colocar em US//
		
		Locale.setDefault(Locale.US);
		
		//*** VARIÁVEIS ***//
		
		int num_func;
		double horas_trabalhadas, valor_hora, salario;
		Scanner sc = new Scanner(System.in);
		
		//*** CÓDIGO ***//
		
		System.out.println("!!! O programa lê . ao invés de , !!!");
		System.out.println("Digite o número do funcionário");
		num_func = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas no mês");
		horas_trabalhadas = sc.nextDouble();
		System.out.println("Digite quanto vale a hora do funcionario " + num_func);
		valor_hora = sc.nextDouble();
		
		salario = horas_trabalhadas * valor_hora;
		
		System.out.printf("O valor total do salario do funcionario %d é de U$ %.2f", num_func, salario);
	
		sc.close();
	}
	
}
