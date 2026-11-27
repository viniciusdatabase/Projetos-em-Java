package enitties;

public class ArmasPersonagemPlayer {
	
	public void equiparEspada() {

		espada = true;
		maosNuas = false;
		arcoFlecha = false;

	}

	public void equiparArcoFlecha() {

		espada = false;
		maosNuas = false;
		arcoFlecha = true;

	}
	
	public void equiparMaosNuas() {
		
		espada = false;
		maosNuas = true;
		arcoFlecha = false;
		
	}

}
