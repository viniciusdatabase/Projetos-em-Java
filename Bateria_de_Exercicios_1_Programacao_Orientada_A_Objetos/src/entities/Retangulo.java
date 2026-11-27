package entities;

public class Retangulo {
	
	public double largura, altura;
	public double a, p, d;
	
	public double Area() {
		
		return  a = largura * altura;
		
	}
	
	public double Perimeter() {
		
		return p = 2 * (largura + altura);
		
	}
	
	public double Diagonal() {
		
		return d = Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
		
	}
}
