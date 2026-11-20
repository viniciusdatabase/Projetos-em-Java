import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int x;
		String s0, s1, s2, s3;

		//o next lê apenas a primeira palavra
		//o nextLine lê a linha toda
		
		//se você fizer um nextLine(); aquela quebra de linha
		//pendente será absorvida pelo nextLine();
		
		//para isso, fazemos um nextLine(); antes de s1 nextLine
		
		x = sc.nextInt();
		s0 = sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
