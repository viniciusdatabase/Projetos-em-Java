package entities;

public class Matematica {
	
	public double a;
	public double b;
	public double soma, subtracao, multiplicacao, divisao;
	
	public double soma() {
		
		this.soma = this.a + this.b;
		System.out.println(this.soma);
		return 0;

	}
	
	public double subtracao() {
		
		this.subtracao = this.a - this.b;
		System.out.println(this.subtracao);
		return 0;

		
	}
	
	public double multiplicacao() {
		
		this.multiplicacao = this.a * this.b;
		System.out.println(this.multiplicacao);
		return 0;

		
	}
	
	public double divisao() {
		
		
		if (this.b == 0)
			System.out.println("Espertinho... desta vez não");
		
		else {		
			this.divisao = this.a / this.b;

		System.out.println(this.divisao);}
		return 0;

		
	}
}
