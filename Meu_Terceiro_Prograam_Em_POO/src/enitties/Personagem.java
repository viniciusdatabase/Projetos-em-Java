package enitties;

public class Personagem {

	public int vidaAtual = 50, vidaMaxima = 200, ataque;
	public String nome;

	public void exibirStatusPlayer() {

	 System.out.println("Personagem " + nome + " tem " + vidaAtual + " / " + vidaMaxima + " de vida");

	}

	public int receberDano(int quantidade) {


		return vidaAtual -= quantidade;

	}

	public int curar(int quantidade) {


		return vidaAtual += quantidade;

	}
	
	public int atacar(int poder){
		
		return poder;
		
	}

}
