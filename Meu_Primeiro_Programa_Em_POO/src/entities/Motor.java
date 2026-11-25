package entities;

public class Motor {
	
	public int rpm;
	public double velocidade;
	public boolean ligado = false;
	
	public void ligar_O_Carro(){
		
		ligado = true;
		System.out.println("O carro está ligado");
		
	} //fim do método ligar_O_Carro
	
	
	public void aceleracao(){
		
		System.out.println("Acelerando...");
		
		for (int i = 0 ; i <= velocidade ; i++) {
		
		System.out.println("Sua velocidade atual é de " + i);
		
		} //fim do laço for
	
	} //fim do método aceleracao

}
