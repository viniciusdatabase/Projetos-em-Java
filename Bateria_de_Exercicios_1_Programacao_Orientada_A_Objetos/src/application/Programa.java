package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//*** variáveis ***//
		
		Retangulo calc = new Retangulo();
		
		//*** CÓDIGO ***//
		
		System.out.println("Enter rectangle widht and height");
		calc.largura = sc.nextDouble();
		calc.altura = sc.nextDouble();
		
		System.out.printf("Area = %.2f\n" , calc.Area());
		System.out.printf("Perimeter = %.2f\n" , calc.Perimeter());
		System.out.printf("Diagonal = %.2f" , calc.Diagonal());
		
		sc.close();
		
	}

}
