package enitties;

public class Inimigo {
	
	public int vidaAtual = 100, vidaMaxima = 100;
	public String nome = "Bandido do Mato";

	public void exibirStatusInimigo() {

		System.out.println("Personagem " + nome + " tem " + vidaAtual + " / " + vidaMaxima + " de vida");

	}

	public int receberDano(int quantidade) {
		
		vidaAtual -= quantidade;
		
		 if (this.vidaAtual < 0) {
		        this.vidaAtual = 0;
		    }
		
		return vidaAtual;

	}
}
