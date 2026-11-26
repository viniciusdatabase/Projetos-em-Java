package application;

import java.util.Locale;
import java.util.Scanner;

import enitties.Inimigo;
import enitties.Personagem;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		// *** VARIÁVEIS ***//

		Inimigo enemy = new Inimigo();
		Personagem player = new Personagem();
		int opcao;

		// *** CÓDIGO ***//

		System.out.println("Olá forasteiro, qual é o seu nome?");
		player.nome = sc.next();
		System.out.println(player.nome + " é? Parece que já ouvi este nome, eu devo te matar agora!");
		System.out.println("*** SE PREPARE PARA A BATALHA ***");

		do 
		{
			System.out.println("1 - Status de " + player.nome);
			System.out.println("2 - Status de " + enemy.nome);
			System.out.println("3 - Curar");
			System.out.println("4 - Atacar");
			System.out.println("5 - Defender");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				player.exibirStatusPlayer();
				break;

			case 2:
				enemy.exibirStatusInimigo();
				break;
				
			case 3:
				player.curar(20);
				player.receberDano(10);
				break;

			case 4:
				enemy.receberDano(200);
				player.receberDano(10);
				break;
				
			case 5:
				player.receberDano(5);
				break;

			default:
				System.out.println("Opção Inválida!");
				break;

			}// fim do switch
		
		} while (player.vidaAtual > 0 && enemy.vidaAtual > 0);

		if (player.vidaAtual == 0) {
			
			System.out.println(player.nome + " sente um grande mal estar...");
			
			System.out.printf("You, who has fallen before fulfilling your destiny... \nBeyond lies the land to which all souls eventually return. \nDo not be afraid...");
		}
		
		else if (enemy.vidaAtual == 0){
			
			System.out.println(player.nome + " conseguiu derrotar " + enemy.nome);
			
		}
		
		else
			//vai fazer o que? :P

		sc.close();

	}

}
