import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		
		//String x;
		//int x;
		//double x;
		
		Scanner sc = new Scanner(System.in);
		
		//aqui eu disse que o valor sc pertence a variável Scanner que em seguida é
		//atribuido um valor chamado new Scanner(System.in); nele
		
		//x = sc.nextInt();
		//x = sc.nextDouble();
		
		//Para o usuário entrar com uma string
		//String x; //primeiro se cria uma variável x do tipo String 
		//x = sc.next(); //onde x é o nome da variável
		//System.out.println("Você digitou: " + x); //onde + x é o nome desta variável
		//sem precisar do "%s" e da vírgula ,
		
		//para o usuário entrar com um inteiro
		//int x; // primeiro se cria uma variavel x do tipo inteiro
		//x = sc.nextInt(); //depois se chama o nome da variável que criei lá em Scanner
		//com .nextInt(); no final
		
		//para o usuário entrar com um float
		//double x; // primeiro se cria uma variável x do tipo double
		//x = sc.nextDouble(); //parecido com o int, se chama o sc acompanhado do
		//.nextDouble(); no final
		
		//para o usuário entrar com um caractere
		//char x; // se cria uma variavel x do tipo char
		//x = sc.next().charAt(0) // se adiciona .charAt(0) para o programa pegar o
		//primeiro caractere digitado pelo usuário 'Maria' pega-se o 'M'
		
		//quando a variável é do tipo String ou char, usa-se a concatenação + ao invés
		//da vírgula e println ao invés de printf, por exemplo:
		// System.out.println("você digitou: " + x);
		
		//quando a variável é do tipo int, float, double, byte, usa-se a vírgula e a 
		//porcentagem, exemplo
		// System.out.printf("O numero que esta na variavel x é: %d",x);
		
		//este é um exemplo de como eu leio varios dados de uma vez.
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Você digitou: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
		//do mesmo jeito que eu abri o sc lá em cima, eu fecho ele aqui em baixo
	}
}
